package main_study.The_07_28;

import java.util.Scanner;

public class ForEx01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("몇번 반복할까요?");
        int number = in.nextInt();
        int i=1 ;
        for(i=1; i<=number; i++) {//뭔말이여

            System.out.println(i + "번째");
        }

    }
}
