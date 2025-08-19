package main_study.The_07_31;

import java.util.Scanner;

public class 연습장 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int money=0;//잔고를 관리하는 변수-계획대로 안됨
        String Format = """
                
                *******************************
                 1.예금 : 2.출금 : 3.잔고 : 4.종료
                *******************************
                """;// 깔끔한 형식을 위해서 포멧을 이용

        while (true) {//답변 받을 때마다 반복적이며 다른 업무를 수행해야함으로 와일을 선택
            //문제의 조건이었음
            System.out.printf(Format);
            System.out.print("원하시는 업무를 선택하세요");//입력값을 받기 위한 출력
            String in = sc.nextLine();// 귀찮아서 String으로 통일
            System.out.print("금액을 입력해주세요");




            switch (in) {// 입력값에 따라 출력값이 바뀌는 것을 위한 스위치 사용

                case "1":

                    int plus = sc.nextInt();
                    System.out.printf(Format);
                    System.out.println("선택> " + in);
                    System.out.println("예금액>" + (money+=plus));
                        break;
                case "2":
                    //int minus= -=price

                    System.out.printf(Format);
                    int minus = sc.nextInt();
                    System.out.println("선택> " + in);
                    System.out.println("출금액>" + (money-=minus));
                    break;
                case "3":
                    System.out.printf(Format);
                    System.out.println("선택> " + in);
                    System.out.println("잔고>"+money  );//1번의 예금액에서 출금액 빠진 금액 출력하려다가 실패
                    break;
                case "4":

                    System.out.println("선택> " + in);
                    System.out.println();
                    System.out.println("프로그램 종료");
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");


            }
        }
    }
}