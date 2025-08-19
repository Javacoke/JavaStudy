package SoloStudy.김영한씨_반복문;

public class While문 {
    public static void main(String[] args) {

        int count=0;
        //while문은 반복횟수가 클때
        //for문은 반복횟수가 정해져있을 경우
        while (count<3) {
            count = count + 1;
            System.out.println("현재 숫자는:" + count);
        }

    }
}
