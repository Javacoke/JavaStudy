package SoloStudy.형성평가;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("100이하의 두개의 정수를 입력하시오");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > 100 || num2 > 100) {
            System.out.println("100이하의 두개의 정수를 입력하시오");
        }
        int start = Math.min(num1, num2);//제일 작은거
        int end = Math.max(num1, num2);// 제일 큰거

        for (int i = start; i <= end; i++) {
            System.out.printf(i+" ");



        }
    }
}