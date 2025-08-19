package main_study.the_08_05;

import main_study.the_08_05.Account;

public class AccountManager {
    private main_study.the_08_05.Account[] ac = new main_study.the_08_05.Account[100];        // 계좌 저장 배열
    private int count = 0;                           // 저장된 계좌 개수

    public boolean createAccount(String num, String name, int balance) {
        if (count >= ac.length) {
            System.out.println("더 이상 계좌를 생성할 수 없습니다.");
            return false;
        }
        ac[count++] = new main_study.the_08_05.Account(num, name, balance);
        System.out.println("계좌가 생성되었습니다.");
        return true;
    }

    public void listAccounts() {
        System.out.printf(  """
                -----------
                계좌목록
                -----------\n""");
        for (int i = 0; i < count; i++) {
            main_study.the_08_05.Account a = ac[i];
            System.out.printf("계좌번호: %s, 계좌주: %s, 잔액: %d\n",
                    a.getNum(), a.getName(), a.getBalance());
        }
    }

    public boolean deposit(String num, int money) {
        main_study. the_08_05.Account a = findAccount(num);
        if (a == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return false;
        }
        return a.push(money);
    }

    public boolean withdraw(String num, int money) {
        main_study. the_08_05.Account a = findAccount(num);
        if (a == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return false;
        }
        return a.pull(money);
    }

    private Account findAccount(String num) {
        for (int i = 0; i < count; i++) {
            if (ac[i].getNum().equals(num)) {
                return ac[i];
            }
        }
        return null;
    }
}

