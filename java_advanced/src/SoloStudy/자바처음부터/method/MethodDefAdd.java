package SoloStudy.자바처음부터.method;

public class MethodDefAdd {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작");
        hiEveryone(12);
        hiEveryone(13);
        System.out.println("프로그램의 끝");


    }
        public static void hiEveryone (int age)//메소드 이름 hiEveryone, 매개변수(int age)
        {
            System.out.println("좋은 아침입니다.");
            System.out.println("제 나이는" + age+"세입니다");

        }




}