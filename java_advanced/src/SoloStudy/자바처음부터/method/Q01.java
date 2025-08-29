package SoloStudy.자바처음부터.method;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

    int num1 = sc1.nextInt();
    int num2 = sc2.nextInt();

        int sum = num1 + num2;
        int minus = num1 - num2;
        int multi = num1 * num2;
        double div = num1 / num2;
        int rem = num1 % num2;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(rem);
    }



}
