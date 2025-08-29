package SoloStudy.백준.단계1;

import java.util.Scanner;

public class 불기서기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        if (y<1000|| y>3000){
            System.out.println("잘못된 수를 입력하셨습니다");
            return;
        }
        int year = y-543;
        System.out.println(year);
    }
}
