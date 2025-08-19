package main_study.The_07_29;

import java.util.Scanner;

public class StartEx07 {
    public static void main(String[] args) {

        int n = 1;//5행짜리 삼각형

        for (int i = 0; i < n; i++) { //작업해야하는 횟수
               for (int j = i; j < n - 1; j++) {//n행이 가져야 할 공백수
                System.out.print(" ");
            }
               for (int j = 0; j < i * 2 + 1; j++) {//n행이 가져야 할 별 수
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
