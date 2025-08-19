package SoloStudy.형성평가;

import java.util.Scanner;

public class 반복제어문2_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("100이하의 자연수를 입력하세요");
        int n = sc.nextInt();

            int sum=n;
            for (int i=0; i<n;i++){
            sum += n;
            }

        System.out.printf("%.2f",(double)sum/n);

    }
}
