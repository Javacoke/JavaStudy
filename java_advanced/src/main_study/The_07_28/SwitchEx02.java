package main_study.The_07_28;

import java.util.Scanner;

public class SwitchEx02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("학력을 입력하세요.A,B,C중");

        char grade = in.next().charAt(0);//charAt 이건 또뭔데 씹덕아????????

        //사용자에게 A~C 중 한문자를 받아서 'A'==>"매우 우수" B=>"우수" C=>"노력하세요"

        switch (grade) {// 이 괄호에 뭐가 들어가는거냐

            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력하세요");
                break;

            default:
                System.out.println("잘못 입력하셨습니다.");


        }
    }
}
