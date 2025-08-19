package SoloStudy.백준.단계1;

import java.util.Scanner;



public class 사칙연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (1>A || B>10000){
            return;
        }

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);



    }

}
