package SoloStudy.김영한씨_반복문;

public class While문2 {
    public static void main(String[] args) {
        //i 부터 하나씩 증가하는 수를 3번까지 더해라(i~i+2더하기)
        int sum = 0;

        int i = 10;

        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);
        i++;
        sum = sum + i;
        System.out.println("i=" + i + " sum=" + sum);

    }
}
