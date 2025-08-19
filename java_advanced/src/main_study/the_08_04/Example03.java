package main_study.the_08_04;

import java.util.Scanner;

public class Example03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("사용자 아이디를 입력해 주세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해 주세요");
        String pwd = sc.nextLine();


    }


    public static int division(int number1, int number2) {
        int n1 = number1, n2 = number2, result = 0;
        if (n2 != 0) {
            result = n1 / n2;
        } else System.out.println("0으로 나누기 금지");

        return result;// int랑 리턴은 셋트다
    }
}
