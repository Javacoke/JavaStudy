package main_study.The_08_01.jungol;

import java.util.Scanner;

public class 문자열1_연습문제4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        int 길이= str.length();

        System.out.println("입력받은 문자열의 길이는 "+길이+"입니다");

        for (int i = 길이-1; i >=0; i--) {
            System.out.println(str.charAt(i));

        }


    }

}
