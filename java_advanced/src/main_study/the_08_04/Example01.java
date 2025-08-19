package main_study.the_08_04;

import java.util.Scanner;

public class Example01 {
    //사용자가 원하는 만큼 method() 기능을 호출
    static Scanner sc = new Scanner(System.in);

    public static void method() {
        int counter =0;
        //counter = sc.nextInt(); sc는 같은 영역이 아니므로 에러가 뜬다
        counter = sc.nextInt(); //static Scanner로 변환하면 사용 가능
        System.out.println("method 시작");
     //   System.out.println("static Method");
       // System.out.println(" 5+6 = 11");
        System.out.println("method 끝");



    }

    public static void main(String[] args) {
        /*method();//정적(static)메서드 호출
        method();//정적(static)메서드 호출
        method();//정적(static)메서드 호출
        method();//정적(static)메서드 호출
        method();//정적(static)메서드 호출*/
        int counter =0;
        System.out.println("몇번을 수행할까요?");
        counter = sc.nextInt();


        for (int i = 0; i < counter; i++) {
            System.out.println(i+"번째 호출");
            method();

        }

        System.out.println("원하는 만큼 method()호출후 여기로 돌아오지용");


    }
}
