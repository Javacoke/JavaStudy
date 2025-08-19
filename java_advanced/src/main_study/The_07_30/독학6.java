package main_study.The_07_30;

import java.util.Scanner;

public class 독학6 {


    static Scanner sc = new Scanner(System.in);//2번


    public static void main(String[] args) {
        //1. 음식 3개를 저장할 상자 만들기
        //2. 입력받기
        //3. 입력 받은거 상자에 넣기
        //4. 출력하기
        //5. 치킨이 나오면 치킨이다. 치킨나왔다~ 오늘은 치맥! 이라는 문구 나오게하기


        String[] 음식 = new String[3]; //1번

        System.out.println("좋아하는 음식 3가지를 입력하세요:");

        for (int i = 0; i < 음식.length; i++) {//2번+3번
            음식[i] = sc.nextLine();//2번


        }
        System.out.println("입력한 음식 메뉴");//4번

        for (int i = 0; i < 음식.length; i++) {
            System.out.println(음식[i] + " 맛있죠~!");

            if (음식[i].equals("치킨")) {//5번
                System.out.println("치킨 나왔다~ 오늘은 치맥!");

            }


        }

        sc.close();
    }
}
