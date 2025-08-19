package SoloStudy.형성평가;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int evenCount =0;
        int oddCount =0;
        System.out.println("10개의 정수를 입력하세요");

        int num = sc.nextInt();


        for(int i=1;i<=10;i++) {//입력 숫자의 갯수
            if (num % 2 == 1) {
                oddCount++;
            }else {evenCount++;}

        }
        System.out.printf("even : \n odd : "+evenCount,oddCount);
    }

}
