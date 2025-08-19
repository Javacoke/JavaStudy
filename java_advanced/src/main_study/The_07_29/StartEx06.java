package main_study.The_07_29;

import java.util.Scanner;

public class StartEx06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("몇행으로 피라미드를 만들까요?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}