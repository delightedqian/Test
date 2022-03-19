package io.delightedqian;

import java.util.ArrayList;
 import java.util.Random;
 import java.util.Scanner;

 /**
 * Project Name: Case02ATMSystem
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/19
 * TIME:  9:25
 */
public class Case02ATMSystem {
    public static void main(String[] args) {
//      1  定义一个账户类
//      2 定义一个集合容器，负责以后存储账户
        ArrayList<Account> accounts = new ArrayList<>();
//        此扫描器最好放在循环外面，节省空间
        Scanner sc = new Scanner(System.in);
//      3  展示系统首页
        while (true) {
            System.out.println("========欢迎登录中国建设银行（济南分行）ATM系统========");
            System.out.println("1.账户登录");
            System.out.println("2.账户注册");
            System.out.println("请选择你想要的服务 ");

            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //用户登录操作
                    login(accounts, sc);
                    break;//返回到这后，break，回到展示系统页
                case 2:
                    //用户注册(单独的方法）
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的信息有误");
            }
        }
    }

    /**
     * 登录功能
     *
     * @param accounts 全部账户的集合
     * @param sc       扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("========系统登录操作========");
        //1判断有无账户
        if (accounts.size() == 0) {
            System.out.println("对不起，当前系统还没有任何账户,请先开户");
            return;
        }
        //2正式登录操作
        while (true) {
            System.out.println("请输入登录卡号");
            String cardId = sc.next();
            // 3判断卡号是否存在，根据卡号去账户集合查询对象
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null) {
                //卡号存在
                //4 输入密码
                while (true) {
                    System.out.println("请输入你的密码");
                    String passWord = sc.next();
                    //判断与账户对象的密码是否一致
                    if (acc.getPassWord().equals(passWord)) {
                        System.out.println("登陆成功！" + acc.getUserName()
                                + "先生/女士，你的卡号是" + acc.getCardID());

//                        展示登录后的页面
                        showUserCommand(sc, acc,accounts);
                        return;//返回到这后，再干掉登录方法，回到调用login的地方
                    } else {
                        System.out.println("输入的密码有误");
                    }
                }

            } else {
                System.out.println("你输入的卡号不存在");
            }
        }

    }

    /**
     * 展示登录后的操作页
     */
    private static void showUserCommand(Scanner sc, Account acc,ArrayList<Account> accounts) {
        while (true) {
            System.out.println("=========ATM机用户操作页=========");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转帐");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("===中国建设银行（济南分行）===");
            System.out.println("请选择");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    depositMoney(acc,sc);
                    break;
                case 3:
                    //取款
                    drawMoney(acc,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(sc,acc,accounts);
                    break;
                case 5:
                    //修改密码
                    updatePassWord(sc,acc);
                    return;//修改完密码后直接回到账户登录
                case 6:
                    //退出
                    System.out.println("退出成功");
                    return;//返回到调用此方法的地方

                case 7:
                    //注销账户
                    if(deleteAccount(acc,sc,accounts)){
                        return;//注销成功回到1  2
                    }else{
                        break;//回到菜单页
                    }



                default:
                    System.out.println("你输入的操作命令不正确");
            }
        }
    }

     private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
         //从当前账户对象销毁
         System.out.println("=======账号注销=======");
         System.out.println("你确认要销户 y/n");
         String rs =sc.next();
         switch (rs){
             case "y":
                 if(acc.getMoney()>0){
                     System.out.println("余额不为0，不能注销");
                 }else{
                     accounts.remove(acc);
                     System.out.println("账号注销完成");
                     return true;
                 }
                 break;
             default:
                 System.out.println("好的，当前账户保留");
         }
         return false;
     }

     /**
      * 修改密码
      * @param sc  扫描器
      * @param acc  当前登录的账户
      */
     private static void updatePassWord(Scanner sc, Account acc) {
         System.out.println("======用户密码修改======");
         while (true) {
             System.out.println("请输入当前密码");
             String passWord = sc.next();
             //1判断密码是否正确
             if(acc.getPassWord().equals(passWord)){
                 while (true) {
                     //密码正确，输入新密码
                     System.out.println("请输入新密码");
                     String newpassword = sc.next();

                     System.out.println("确认新密码");
                     String okPassWord = sc.next();
                     if(newpassword.equals(okPassWord)){
                         //一致，可以修改
                         acc.setPassWord(okPassWord);
                         System.out.println("修改成功");
                         return;
                     }else{
                         System.out.println("两次密码不一致");
                     }
                 }
             }else{
                 System.out.println("输入的密码不正确");
             }
         }


     }

     /**
     * 转账功能
     * @param sc  扫描器
     * @param acc 自己的账户对象
     * @param accounts 全部账户对象
     */
    private static void transferMoney(Scanner sc, Account acc, ArrayList<Account> accounts) {
        System.out.println("========转账页面========");
//        1判断是否满足2个用户
        if(accounts.size()<2){
            System.out.println("当前账户不足，不能进行转帐");
            return;
        }
//        2判断自己是否有钱
        if(acc.getMoney()==0){
            System.out.println("余额不足，无法转帐");
            return;
        }
        //开始转账
        while (true) {
            System.out.println("请输入对方账户的卡号");
            String cardId = sc.next();
            if(cardId.equals(acc.getCardID())){
                System.out.println("不能给自己转账");
                continue;
            }
            //根据这个查询对方账户
            Account account = getAccountByCardId(cardId,accounts);
            if(account == null){
                System.out.println("对不起，卡号不存在");
            }else{
                //账户存在 认证他的姓氏
                String userName = account.getUserName();
                String tip = "*"+userName.substring(1);
                System.out.println("请输入["+ tip +"]的姓氏");
                String preName = sc.next();

                //认正姓氏通过
                if(userName.startsWith(preName)){
                    while (true) {
                        //认证通过，开始转账
                        System.out.println("请输入转账金额");
                        double money =sc.nextDouble();
                        //判断是否超过限额
                        if(money > acc.getQuotaMoney()){
                            System.out.println("对不起，超过了限额"+acc.getQuotaMoney());
                        }
                       else{
                            if(acc.getMoney()<money){
                                System.out.println("余额不足，你最多可转"+ acc.getMoney());
                            } else{
                                //余额足够，可以转账
                                acc.setMoney(acc.getMoney()-money);
                                account.setMoney(account.getMoney()+money);
                                System.out.println("转账成功 剩余"+acc.getMoney());
                                return;
                            }

                        }
                    }

                }else{
                    System.out.println("信息有误");
                }


            }
        }

    }

    /**
     * 取钱功能
     * @param acc 当前账户对象
     * @param sc  扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {

            System.out.println("========取款页面========");
            //1判断是否满足 100元
            if(acc.getMoney()<100){
                System.out.println("不足100元，无法取款");
                return;
            }
        while (true) {
            //2提示输入取款金额
            System.out.println("请你输入取款金额");
            double money = sc.nextDouble();
            //3判断是否满足
            if(money > acc.getQuotaMoney()){
                System.out.println("对不起，超过了限额"+acc.getQuotaMoney());
            }else{
                //没超过当此限额
                //4判断是否超过存款金额
                if(money > acc.getMoney()){
                    System.out.println("余额不足，目前余额"+acc.getMoney());
                }else{
                    //可以取
                    System.out.println("恭喜，取钱成功"+money);
                    //更新余额
                    acc.setMoney(acc.getMoney()-money);
                    //取钱结束了
                    showAccount(acc);
                    return;//干掉取钱方法
                }
            }
        }

    }

    /**
     * 账户存钱功能
     * @param acc  当前账户对象
     * @param sc   扫描器
     */
    private static void depositMoney(Account acc,Scanner sc) {
        System.out.println("=======用户存钱功能=======");
        System.out.println("请输入存款的金额");

        double money = sc.nextDouble();

        //更新账户余额：原来的钱+现在存入的钱
        acc.setMoney(acc.getMoney()+money);
        System.out.println("存款成功");
        showAccount(acc);
//          不需要把acc再扔到accounts,上面已经修改了
//           accounts.add(acc);
    }

    /**
     * 展示账户信息
     *
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("========当前账户信息如下========");
        System.out.println("卡号 " + acc.getCardID());
        System.out.println("户主 " + acc.getUserName());
        System.out.println("余额 " + acc.getMoney());
        System.out.println("限额 " + acc.getQuotaMoney());
    }

    /**
     * 为账户开户功能
     *
     * @param accounts 接收的账户集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("========系统注册操作=========");
//        1创建账户对象，用于后期封装账户信息
        Account account = new Account();

//        2录入当前账户信息，注入账户对象中
        System.out.println("请输入账户用户名");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请输入账户密码");
            String passWord = sc.next();
            System.out.println("请确认账户密码");
            String okPassword = sc.next();
            if (okPassword.equals(passWord)) {
                //密码验证通过，可以注入给账户对象
                account.setPassWord(okPassword);
                break;//密码已经录入成功，死循环可以结束
            } else {
                System.out.println("你输入的两次密码不一致");
            }
        }
        System.out.println("请输入账户当次限额");
        double qutoMoney = sc.nextDouble();
        account.setQuotaMoney(qutoMoney);

//        为账户随机一个8位且与其它账户卡号不重复的号码（独立功能，独立成方法）
        String cardId = getRandomCardId(accounts);
        account.setCardID(cardId);

//        3把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("恭喜" + userName + "开户成功" + cardId + "请妥善保管");

    }

    /**
     * 为账户生成8位与其他账户不同的号码
     *
     * @return
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
//        1先生成8位数字
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

//       2 判断这个卡号是否与账户集合中的卡号重复
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                //说明cardId此时没重复
                return cardId;
            }
        }

    }

    /**
     * 根据卡号查询出一个账户对象
     *
     * @param cardId   卡号
     * @param accounts 全部账户的集合
     * @return 账户| null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardID().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

}
