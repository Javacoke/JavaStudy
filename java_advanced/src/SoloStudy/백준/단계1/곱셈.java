package SoloStudy.백준.단계1;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int B1 = num2%10;//일의자리
        int B2 = (num2/10)%10;//십의자리
        int B3 = (num2/100)%10;//백의자리
        if (100>num1 || 100>num2 || 999<num1 || 999<num2) {
            System.out.println("잘못 입력하셨습니다");
        return;
        }
        System.out.println(num1*B1);
        System.out.println(num1*B2);
        System.out.println(num1*B3);
        System.out.println(num1*num2);


    }
}
