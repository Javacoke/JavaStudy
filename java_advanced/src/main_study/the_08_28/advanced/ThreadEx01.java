package main_study.the_08_28.advanced;

public class ThreadEx01 {
    public static void main(String[] args) {
        Thread mainThread = new Thread(); { //실행하는 스레드 객체 참조 얻기
            System.out.println(mainThread.getName() + "실행");

        for (int i = 0; i < 3; i++) {//3개의 쓰레드 클래스를 이용해서 쓰레스 단위로 실행시킨다.
            Thread thread = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName()+"실행");
                }

            };
         //   Thread.start();//스레드 일 시작해라
            //getName()메소드는 Thread의 인스턴스메소드로 스레드의 인스턴스 메소드로 스레드의 이름을 리턴

            Thread chatThread =new Thread(){
               @Override
                public void run(){
                    System.out.println(getName()+"실행");

                }

            };
            chatThread.setName("chatting-thread");
            chatThread.start();
        }
        }






    }
        }
