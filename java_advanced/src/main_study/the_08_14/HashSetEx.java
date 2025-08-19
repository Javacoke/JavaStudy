package main_study.the_08_14;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {


        Set<String> set = new HashSet<String>();

        //객체저장
        set.add("Java");
        set.add("JDBC");
        set.add("Jsp");
        set.add("Jsp");
        set.add("Spring");

    int size = set.size();
        System.out.println(size);
    }

}
