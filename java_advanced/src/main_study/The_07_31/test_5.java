package main_study.The_07_31;

public class test_5 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {//5줄만들어라
            for (int j = 1; j <= i; j++) {//
                System.out.print("*");//줄바꿈 하면 안되었기 때문에 프린트 사용
            }
            System.out.println();//줄바꾸기
        }

    }
}