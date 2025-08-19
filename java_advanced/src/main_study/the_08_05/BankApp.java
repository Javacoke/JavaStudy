package main_study.the_08_05;

import main_study.the_08_05.AccountManager;

import java.util.Scanner;


public class BankApp {

    static Scanner sc = new Scanner(System.in);//입력값을 모든 곳에 써야함으로 static사용
    static AccountManager manager = new AccountManager(); //계좌를 관리하는 매니저

    private static void CreateAccount() {
        System.out.println("""
            ----------
            계좌생성
            ----------
            """);

        System.out.println("계좌번호: ");
        String num = sc.nextLine();
        System.out.println("계좌주: ");
        String name = sc.nextLine();
        System.out.println("초기입금액: ");
        int firstpush = Integer.parseInt(sc.nextLine());

        manager.createAccount(num, name, firstpush); //매니저한테 계좌 만들어달라고 시킨다
    }

    private static void ListAccounts() {
        manager.listAccounts(); //매니저한테 계좌 목록 보여달라고 시킨다
    }

    private static void Deposit() {
        System.out.println("입금할 계좌번호: ");
        String num = sc.nextLine();
        System.out.println("입금액: ");
        int money = Integer.parseInt(sc.nextLine());

        manager.deposit(num, money); //매니저한테 입금하라고 시킨다
    }

    private static void Withdraw() {
        System.out.println("출금할 계좌번호: ");
        String num = sc.nextLine();
        System.out.println("출금액: ");
        int money = Integer.parseInt(sc.nextLine());

        manager.withdraw(num, money); //매니저한테 출금하라고 시킨다
    }

    public static void main(String[] args) {
        boolean run = true;
        String form = """
            -----------------------------------------------
            1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료
            -----------------------------------------------
            """;

        while (run) {
            System.out.print(form); // 메뉴 보여준다
            System.out.print("선택> ");
            System.out.println();
            int choice = sc.nextInt();
            sc.nextLine();// nextline과 nextInt 충돌버그 생겼었음

            switch (choice) {
                case 1:
                    CreateAccount(); //계좌생성
                    break;
                case 2:
                    ListAccounts(); //계좌목록
                    break;
                case 3:
                    Deposit(); //입금
                    break;
                case 4:
                    Withdraw(); //출금
                    break;
                case 5:
                    System.out.println("시스템을 종료합니다."); //종료멘트
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다."); //에러처리
            }
        }
    }
}