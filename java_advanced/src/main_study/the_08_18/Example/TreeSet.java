package main_study.the_08_18.Example;

public class TreeSet implements Comparable<TreeSet> {
    public String name;
    public int price;

    public TreeSet(String name, int price) {
        this.name = name;
        this.price = price;


    }

    @Override
    public int compareTo(TreeSet o) {

        if (this.price > o.price) return -1;
        if (this.price < o.price) return 1;
        else return 0;


    }

    public static void main(String[] args) {
        Fruit 사과 = new Fruit();
        Fruit 귤 = new Fruit();
        Fruit 복숭아 = new Fruit();
        Fruit 포도 = new Fruit();
    }
}
