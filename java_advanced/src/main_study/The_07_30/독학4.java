package main_study.The_07_30;

import java.util.Scanner;

public class 독학4 {

    static Scanner sc = new Scanner(System.in); //2번

    public static void main(String[] args) {

        //1.사용자에게 음식메뉴를 입력받을 한칸 박스를 만든다
        //2.입력받는다.
        //3.입력 받은걸을 상자에 넣는다
        //4. 출력한다.


        String[] 음식 = new String[1]; //1번

        System.out.println("좋아하는 음식 한 가지를 입력하세요");

        for (int i = 0; i < 음식.length; i++) { //2번+3번
            음식[i] = sc.nextLine(); //2번

        }


        for (int i = 0; i < 음식.length; i++) {
            System.out.println(음식[i] + " 맛있죠~!");

        }
        sc.close();

    }


}
