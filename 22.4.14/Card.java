package io.delightedqian.d4_collection_test;

/**
 * Project Name: Card
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/14
 * TIME:  19:35
 */
public class Card {
    private String size;
    private String colors;
    private int index;

    public Card() {
    }

    public Card(String size, String colors,int index) {
        this.size = size;
        this.colors = colors;
        this.index=index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return size+colors;
    }
}
