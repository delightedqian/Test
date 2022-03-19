

import java.util.*;
    public class TestDemo{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int count =3;
            while(count!=0){
                System.out.println("请输入你的密码： ");
                String password = scan.nextLine();
                if(password.equals("123456")){
                    System.out.println("密码正确，登录成功");
                    break;
                }else{
                    count--;
                    System.out.println("你还有"+count+"次机会");
                }
            }
            
        }




        public static void main10(String[] args) {
            for(int n =1 ; n<=999999 ; n++){
                int count = 0;
                int tmp = n;
                while(tmp!=0){
                    count++;
                    tmp =tmp/10;
                }
                tmp=n;
                int sum=0;
                while(tmp!=0){
                    sum += Math.pow(tmp%10,count);
                    tmp = tmp/10;
                }
                if(sum == n){
                    System.out.println(sum);
                }
            }
            
        }




        public static void main9(String[] args) {
            int count = 0;
            for(int i =1;i<=100;i++){
                if(i/10 == 9){
                    count++;
                }
                else if(i%10==9){
                    count++;
                }
            }
            System.out.println(count);
        }





        public static void main8(String[] args) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            double sum=0;
            int flg = 1;
            for(int i = 1; i<=n; i++ ){
                sum = sum +1.0/i *flg;
                flg=-flg;
            }
            System.out.println(sum);
        }





        public static void main7(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();

            int b = scan.nextInt();

            int c=b;
            while(a%b!=0){
                c=a%b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }





        public static void main6(String[] args) {
            for(int i=1; i<=9; i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i + "*"+ j +"=" + i*j + " ");
                }
                System.out.println();
            }
        }







        public static void main5(String[] args) {
            Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    for(int year = 1000 ; year<=n; year ++){

        if(year%100!=0 && year%4==0|| year %400==0){
            System.out.println(year+"是闰年");
        }
    }
            
        }
    }







//    import java.util.*;
//    public class TestDemo{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//     int n = scan.nextInt();

//     for(int year = 1000 ; year<=n; year ++){

//         if(year%100!=0 && year%4==0|| year %400==0){
//             System.out.println(year+"是闰年");
//         }
//     }



// }
        

//     }

    


    
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         int n = scan.nextInt();

//         for(int i =1; i<=n ;i++){
//           int j =2  ;
//              for( ;j <= i; j++){
//          if(i % j == 0){
//              //System.out.println(n+" 不是素数 ");
//              break;


//     }
//         }
//          if(j == i){
//             System.out.println(i);
           
//            }

//        }
// }









   	// public static void main3(String[] args) {
   	// 	Scanner scan = new Scanner(System.in);
   	// 	int n = scan.nextInt();
    //     for(int i =2 ;i < n ; i++){
    //     	if(n%i==0){
    //     		break;
    //     	}
    //     	if(n==i){
    //     		System.out.println(n+"是素数");
    //     	}
    //     	else {
    //     		System.out.println(n+"不是素数");
    //     	}
    //     }


   	    // for(int i =2 ;i < n ; i++){
   	    // 	if(n % i == 0){
   	    // 		System.out.println(n+" 不是素数 ");
   	    // 		break;


   	    // 	}
   	    	
   	    // 	}
   	    	

   	       	












  //   public static void main2(String[] args) {

  //   	Scanner scan = new Scanner(System.in);
  //   	int n = scan.nextInt();

  //   	if (n<18){
  //   		System.out.println("少年 ");

  //   	}
  //   	else if(n>=19 && n<=28 ){
  //   		System.out.println("青年 ");

  //   	}
  //   	else if(n>=29 && n<=55 ){
  //   		System.out.println("中年");

  //   	}
  //   	else if(n>55){
  //   		System.out.println("老年");
    		
  //   	}
  //   }








  //    public static void main1(String[] args) {


  //    	Scanner scan = new Scanner(System.in);



 	// Random random = new Random();
 	// int randNum =random.nextInt(100);

 	// //System.out.println (randNum);

 	// while (true){
 	// 	System.out.println("请输入你要猜的数字: ");
 	// 	int num=scan.nextInt();
 	// 	if(num < randNum ){
 	// 		System.out.println("你猜的数字小了");
 	// 	}else if (num == randNum) {
 	// 		System.out.println("你猜的数字对了");
 	// 		break;
 			
 	// 	}else {
 	// 		System.out.println("你猜的数字大了");
 	// 	}
 	// }
  //    }
 


   