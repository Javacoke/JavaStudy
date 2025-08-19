package main_study.The_07_30;

import java.util.Scanner;

public class 독학3 {

    static Scanner sc = new Scanner(System.in); // 2번


    public static void main(String[] args) {

        //1.이름 받을 2개의 박스 필요
        //2. 사용자에게 입력받는다.
        //3. 입력 받은 것을 박스에 저장한다(입력)
        //4. 박스에 입력한 것을 출력한다.

        System.out.println("이름을 입력하세요.");

        String[] 이름 = new String[2];//1번


        for (int i = 0; i < 이름.length; i++) { //2번+3번
            이름[i] = sc.nextLine(); //2번

        } sc.close();

        for (int i = 0; i < 이름.length; i++) {
            System.out.println("안녕, " + 이름[i] + "!");
            ;

        }


    }
}
