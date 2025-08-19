package main_study.The_07_29;

import java.util.Scanner;

public class DoWhileEx02 {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q또는quit를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String inputString;//?

    int x = 10;
    int sum=0;

    do{
        System.out.println("> ");
        inputString = sc.nextLine();
        System.out.println(inputString);
    } while(!inputString.equals("q"));//이게 뭐여
    System.out.println("----------------------------");
    System.out.println("채팅종료");
}
}
