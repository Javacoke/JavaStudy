package main_study.the_08_04;

import java.util.Scanner;

public class Example05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("사용자 아이디를 입력해 주세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해 주세요");
        String pw = sc.nextLine();


    }
    //사용자가 입력한 아이디와 비밀번호를 id pwPrint()를 이용하여 출력하세요.
    public static void idPwprint(String id, String pw){
        System.out.println("id :"+id +" "+ "password : "+pw);

    }
}
