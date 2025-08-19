package main_study.The_08_01.jungol;

import java.util.Scanner;

public class 문자열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A= new String("jungol olympiad");

        for (int i = 0; i < 5; i++) {
            int 타겟 = sc.nextInt();
            if (타겟>14 || 타겟<0) {
                break;
            }
            System.out.println(A.charAt(타겟));
        }

        //1. 문자열 선언
        //2. jungol olympiad 선언
        //3. 사람한테 0~14 사이의 정수 5개 입력받기




    }

}
