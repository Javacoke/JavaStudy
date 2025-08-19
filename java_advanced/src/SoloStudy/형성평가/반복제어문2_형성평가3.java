package SoloStudy.형성평가;

import java.util.Scanner;

public class 반복제어문2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시요");

        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                sum += i;//복합연산자 sum한테 i를 더해서 sum에저장한다
            }
        }
        System.out.println(sum);


    }

}
