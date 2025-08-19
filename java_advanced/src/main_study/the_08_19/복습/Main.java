package main_study.the_08_19.복습;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main{


static class User implements Comparable<User> {
    public String name;
    public int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(User o) {

        if (this.age < o.age) {
            return -1;
        }else if (this.age > o.age) {
            return 1;
        }else{ return 0;}


    }
}

    public static void main(String[] args) {


User[] users = new User[]{
        new User("김유신", 64),
        new User("홍길동", 32),
        new User("김동성", 48),
        new User("박희동", 14),
};

        System.out.println("--------나이 순 오름차순------");
 Arrays.sort(users);//람다식



}

}