package SoloStudy.자바처음부터.method;

public class Method2Param {
    public static void main(String[] args) {

        double myHeight = 175.9;
        hiEveryone(12, 12.5);
        hiEveryone(13, myHeight);
        byEveryone();
    }
        public static void hiEveryone(int age, double height)
        {
            System.out.println("제 나이는"+age+"세입니다");
            System.out.println("저의 키는" + height+"cm입니다");
        }
        public static void byEveryone()
        {
            System.out.println("다음에 뵙겠습니다");
        }


    }

