package main_study.The_07_30;

import java.util.Scanner;

public class 독학1 {

    static Scanner sc = new Scanner(System.in); //2번

    public static void main(String[] args) {
        //1. 이름 넣을 공간 3개가 필요하다.
        //2. 사용자에게 입력을 3번 받아야한다.
        //3. 한 번 입력할 때마다 상자에 넣어야한다.
        //4. 상자에 있는 이름들을 꺼낸다.
        //5. 안녕,[]이름!으로 인사한다.

        String[] 이름 = new String[3];//1. 배열자료형 이름에 저장공간 3개 만들어라
        //String[] 배열자료형
        for (int i = 0; i < 이름.length; i++) {//2번+3번
            이름[i] = sc.nextLine();//입력 받은 이름 저장

        }
        for (int i = 0; i < 이름.length; i++) {
            System.out.println("안녕, " + 이름[i] + "!");

        }


    }


}

