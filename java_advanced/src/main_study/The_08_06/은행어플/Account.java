package main_study.The_08_06.은행어플;

public class Account {

    private static final int  MIN_BALANCE =0;//잔액이 음수면 안됨
    private static final int  MAX_BALANCE =1000000;// 잔액이 백만원 이상 안됨

    private String num;//변수지정 조지기
    private String name;
    private int balance;

    public Account(String num, String name, int money){//클래스이름(외부에서 받아올 정보)
                this.num= num; //여기에 저장하세요
                this.name= name;
                this.balance = balance;
    }

    public String getNum() {//열쇠 주면 계좌 알려줄게
        return num;
    }

    public String getName() {//열쇠 주면 이름 알려줄게
        return getName();
    }

    public int getBalance(){//열쇠 주면 잔액 알려줄게
        return  getBalance();
    }




}
