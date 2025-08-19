package main_study.The_07_28;

import java.util.Scanner;

public class For_test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("몇 번 반복할까요? ");
        int n = in.nextInt();
        for (int a = 1; a <= n; a++) {
            System.out.println("JUNGOL");
        }


    }
}
