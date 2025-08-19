package main_study.The_08_01.jungol;

import java.util.Scanner;

public class 문자열1_연습문제2 {
    public static void main(String[] args) {

        //1. 사람한테 문자를 입력받는다.
        //2. 입력받은거 저장할 장소를 만든다.
        //3. 그냥 엔터를 치면 입력받은 문자를 모두 토해낸다.

        Scanner sc = new Scanner(System.in);//1.

        System.out.println("문자를 입력하세요");

        String 정답 = "";

        while (true) {//다시하기
            String st = sc.nextLine();//2. st에 저장

            if(st.isEmpty()){//3.
                System.out.println(정답);
                break;

            }
            정답+=st;
        }
        }

        }
