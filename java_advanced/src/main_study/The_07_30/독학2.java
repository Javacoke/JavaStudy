package main_study.The_07_30;

import java.util.Scanner;

public class 독학2 {

    static Scanner sc= new Scanner(System.in);
    //2번
    public static void main(String[] args) {
   //1.사용자에게 이름 1개를 받을 박스를 만든다.
   //2.입력받는다
    //3. 입력 받은 걸 박스에 저장한다.
    //4. 출력한다

        System.out.println("이름을 입력해주세요");
        String[] 이름 = new String[1]; //1번




        for (int i = 0; i < 이름.length; i++) {//2+3번
            이름[i]= sc.nextLine();       //2번

        }

        for (int i = 0; i < 이름.length; i++) {
            System.out.println("안녕,"+이름[i]+"!");

        }


    }
}
