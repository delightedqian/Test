package io.delightedqian.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Project Name: TestDemo
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/10
 * TIME:  15:10
 */
public class TestDemo {
    public static void main(String[] args) {
        Collection<Moive> moives = new ArrayList<>();
        moives.add(new Moive("《飞驰人生》",9.5,"沈腾"));
        moives.add(new Moive("《送你一朵小红花》",9.9,"王俊凯"));
        moives.add(new Moive("《战狼》",9.6,"吴京"));

        for (Moive mo : moives) {
            System.out.println("片名"+mo.getName());
            System.out.println("评分"+mo.getScore());
            System.out.println("主演"+mo.getActor());
            System.out.println("---------------");
        }

    }
}
