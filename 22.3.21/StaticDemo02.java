package io.delightedqian.d3_static_code;

import java.util.ArrayList;

/**
 * Project Name: StaticDemo02
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/3/21
 * TIME:  18:36
 */
public class StaticDemo02 {
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] size = {"3","4","5","6","7","8","9","10","J","Q","k","A","2"};

        String[] colors = {"♥","♣","♠","♦"};

        for (int i = 0; i < size.length; i++) {

            for (int j = 0; j < colors.length; j++) {
                String card = size[i]+colors[j];
                cards.add(card);
            }

        }
        cards.add("🃏");
        cards.add("🃏");
    }

    public static void main(String[] args) {
        System.out.println(cards);

    }
}
