package SoloStudy.김영한씨_if문;

public class else_if02 {
    public static void main(String[] args) {

        int age = 14;

        if (age <= 7) { //false
            System.out.println("미취학");
        } else if (age <= 13) { //true
            System.out.println("초등학생");
        } else if (age <= 16) {//false
            System.out.println("중학생");
        } else if (age <= 19) {//false
            System.out.println("고등학생");
        } else {//false
            System.out.println("성인");

        }


    }
}
