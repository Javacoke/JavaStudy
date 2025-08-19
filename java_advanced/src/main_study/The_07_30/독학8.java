package main_study.The_07_30;

import java.util.Scanner;

public class 독학8 {

    static Scanner sc = new Scanner(System.in); //2번

    public static void main(String[] args) {

        //1. 사용자가 입력한 값 저장 할 박스 만들기
        //2. 입력받기
        //3. 입력받은 것 상자에 넣기
        //4. 출력하기
        //5. 파랑이 있으면 하늘처럼 말고 시원한 파랑! 출력
        //6. 빨강이 있으면 불꽃 같은 열정의 빨강! 출력
        //7. 그외엔 그 색깔도 참 멋지네요 출력

        String[] 색깔 = new String[3]; //1번

        System.out.println("좋아하는 색깔3가지를 입력하세요");

        for (int i = 0; i < 색깔.length; i++) {//3번
            색깔[i] = sc.nextLine();//3번
        }


        for (int i = 0; i < 색깔.length; i++) {


            if (색깔[i].equals("파랑")) {//5번
                System.out.println("하늘처럼 맑고 시원한 파랑!");
            } else if (색깔[i].equals("빨강")) {//6번
                System.out.println("불꽃 같은 열정의 빨강!");
            } else {//7번
                System.out.println("그 색깔도 참 멋지네요!");
            }
        }
        sc.close();
    }

}
