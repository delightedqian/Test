package io.delightedqian.d4_collection_test;

import java.util.*;

/**
 * Project Name: GameDmeo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/14
 * TIME:  19:26
 */
public class GameDmeo {
    //定义一个静态集合来存储牌
    public static List<Card> lists = new ArrayList<>();

    //定义扑克
    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors={"♥","♦","♣","♠"};

        int index=0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c = new Card(size,color,index);
                 lists.add(c);
            }
        }
        Card c1= new Card("","大🃏",++index);
        Card c2= new Card("","小🃏",++index);
        Collections.addAll(lists,c1,c2);
        System.out.println("洗牌前"+lists);

    }

    public static void main(String[] args) {
        //洗牌
        Collections.shuffle(lists);
        System.out.println("洗牌后"+lists);

        //定义三个玩家
        List<Card> zhang = new ArrayList<>();
        List<Card> li = new ArrayList<>();
        List<Card> wang = new ArrayList<>();

        //开始发牌
        for (int i = 0; i < lists.size()-3; i++) {
            Card c = lists.get(i);
            if(i%3==0){
                zhang.add(c);
            }else if(i%3==1){
                li.add(c);
            }else if(i%3==2){
                wang.add(c);
            }
        }
        //最后三张牌
        List<Card> LastThreeCards = lists.subList(lists.size()-3,lists.size());

        //排序
         sortLists(wang);
         sortLists(zhang);
         sortLists(li);

        System.out.println("wang"+zhang);
        System.out.println("li"+li);
        System.out.println("wang"+wang);
        System.out.println("最后三张"+LastThreeCards);
    }

    private static void sortLists(List<Card> cards) {
//        Collections.sort(cards, new Comparator<Card>() {
//            @Override
//            public int compare(Card o1, Card o2) {
//                return o2.getIndex()-o2.getIndex();
//            }
//        });






    }
}
