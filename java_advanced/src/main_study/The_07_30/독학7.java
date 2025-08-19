package main_study.The_07_30;

import java.util.Scanner;

public class 독학7 {

    static Scanner sc = new Scanner(System.in);//2번

    public static void main(String[] args) {
        //1. 사용자에게 입력받은 동물 3가지 저장할 박스 만들기
        //2. 사용자에게 입력받기
        //3. 입력받은 동물들 박스에 넣기
        //4. 출력하기
        //5. 강아지가 있으면 귀여운 강아지가 등장했습니다! 출력
        //6. 고양이가 있으면 도도한 고양이, 기분 좋은 하루~" 출력
        //7. 그외엔 그 동물도 멋져요! 출력

        String[] 동물 = new String[3]; //1번

        System.out.println("좋아하는 동물 3가지를 입력하세요");

        for (int i = 0; i < 동물.length; i++) {//3번
            동물[i] = sc.nextLine(); //2번

        }

        System.out.println("입력한 동물 목록:");

        for (int i = 0; i < 동물.length; i++) {
            if (동물[i].equals("강아지")) {
                System.out.println("귀여운 강아지가 등장했습니다.");

            } else if (동물[i].equals("고양이")) {
                System.out.println("도도한 고양이, 기분 좋은 하루~");

            } else {
                System.out.println(동물[i] + "도 멋진 동물이에요");
            }

        }


        sc.close();


    }

}
