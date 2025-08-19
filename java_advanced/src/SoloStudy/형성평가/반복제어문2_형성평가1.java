package SoloStudy.형성평가;


import java.util.Scanner;

public class 반복제어문2_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10이하의 자연수를 입력하시오");

        int n = sc.nextInt();

        if (n > 10) {// 호환성 체크
            System.out.println("100이하의 자연수를 입력하시오");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("JUNGOL");
        }
    }
}
