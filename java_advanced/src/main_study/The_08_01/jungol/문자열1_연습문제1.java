package main_study.The_08_01.jungol;

import java.util.Scanner;

public class 문자열1_연습문제1 {

    public static void main(String[] args) {
        //1. 사람이 문자 하나를 입력한다.
        //2. 컴퓨터가 그 문자를 숫자로 바꾸는 것을 반복한다.
        //3. 출력한다.
        //4. 0이 입력되면 출력하고 멈춘다 멈춘다.
        Scanner sc =new Scanner(System.in);//1.
        System.out.println("문자 한개를 입력하세요");
        while(true){ //2.
         char ch = sc.nextLine().charAt(0);//사람이 말한거중 첫글자만 입력해
            int code = (int)ch;
            System.out.println(ch+" -> "+code+" ");//3.

            if (ch=='0') {//4.
                return;
            }
        }



    }
}
