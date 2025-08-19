package main_study.The_07_29;

import java.util.Scanner;

public class 반복제어문3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num= sc.nextInt();
        int sum=0;
        int i=1;
        while (true) {
            sum+=i;
            if (sum>num){
            break;
            }
        i++;

    }
        System.out.println(sum);
        System.out.println(i);


    }
}
