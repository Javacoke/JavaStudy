package SoloStudy.김영한씨_반복문;

public class 문제_2 {
    public static void main(String[] args) {
        int num = 2;//2부터 시작(짝수)
        int count = 1;//1개부터시작
        while (count <= 10) {//10개
            System.out.println(num);
            num += 2;//짝수
            count++;//순서대로
        }
    }
}
