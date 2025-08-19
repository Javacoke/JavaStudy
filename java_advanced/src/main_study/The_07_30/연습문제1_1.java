package main_study.The_07_30;

import java.util.Scanner;

public class 연습문제1_1 {
    static Scanner sc = new Scanner(System.in);//모두가 쓸 수있게 위로 올림
//
    public static void main(String[] args) {
        int[] array = new int[5];// 스택 공간에 array라는 변수 저장, hip공간에 0,0,0,0,0 저장
        
       /*array[0]= sc.nextInt();
       array[1]= sc.nextInt();
       array[2]= sc.nextInt();
       array[3]= sc.nextInt();
       array[4]= sc.nextInt();*/


        System.out.println("===== itar 방식 입력========");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("===== iter 방식 출력========");
        for (int i : array) {
            System.out.print(i);
            System.out.println();
        }
        System.out.println("===== itar 방식 출력========");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }


    }
}
