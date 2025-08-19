package main_study.The_07_30;

import java.util.Scanner;

public class 독학5 {

    static Scanner sc = new Scanner(System.in); //2번

    public static void main(String[] args) {
        //1.사용자에게 입력 받은 3가지 메뉴를 저장할 3칸짜리 박스를 만든다
        //2.입력 받는다.
        //3.입력 받은 것을 상자에 저장한다.
        //4.출력한다.
        String[] 음식 = new String[3]; // 1번

        System.out.println("좋아하는 음식 3가지를 입력하세요");
        System.out.println("1번 째 좋아하는 음식");
        System.out.println("2번 째 좋아하는 음식");
        System.out.println("3번 째 좋아하는 음식");

        for (int i = 0; i < 음식.length; i++) {//3번
            음식[i] = sc.nextLine();//2번

        }
        System.out.println("입력한 음식 메뉴:");

        for (int i = 0; i < 음식.length; i++) {//4번

            System.out.println(음식[i] + " 맛있죠~!");


        }
        sc.close();

    }

}
