package SoloStudy.김영한씨_if문;

public class IF문 {
    public static void main(String[] args) {
        int age =20;// 사용자 나이 (15로 바꾸면)

        if(age>=18) {//true 코드블럭 실행 (false)
            System.out.println("성인입니다");
        }

        if(age<18) {//false 코드블럭 실행x (true)
            System.out.println("미성년자입니다.");
        }
    }
}
