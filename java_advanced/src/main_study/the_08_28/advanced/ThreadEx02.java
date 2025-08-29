package main_study.the_08_28.advanced;

class Calculator {
    //계산기 클래스 갑자기 왜?? 멀티 스레드배우다가?
    //A. 계산기 1개로 곱셈도 하고 나누기도 하고 더하기도 하고 많은 기능을 가지고 있다,

    private int memory;//계산 결과나 값을  memory에 저장하는 메서드
//정보 저장

    public int getMemory() {//memory 값을 읽어오는 메서드
        return memory;
    }


public synchronized void setMemory1(int memory){
    this.memory = memory;
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        System.out.println(Thread.currentThread().getName() + " interrupted" + this.memory);

    }
    }
}

class User1 extends Thread {
    private Calculator calculator;

    public User1() {//1번째 사용자 정보

        setName("User1의 Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {

    }
}
//Calculator 를 생성해서 User1 과 User2에서 사용하도록 setCalculator()메소드를 호출하고 두 스레드를 시작시키면 알아서 동작한다.
class User2 extends Thread {//2번째 사용자 정보

}

public class ThreadEx02 {//메인
    public static void main(String[] args) {
   Calculator calculator = new Calculator();
   User1 user1 = new User1();
   User1 user2 = new User1();
   user1.setCalculator(calculator);
   user2.setCalculator(calculator);
   user1.start();
   user2.start();


    }
}
