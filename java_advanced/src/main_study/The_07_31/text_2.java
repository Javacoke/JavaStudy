package main_study.The_07_31;

public class text_2 {

    public static void main(String[] args) {
//1. 1부터100까지 세라
//2. 그 중 3의 배수들을 구해라
//3. 그 것들을 더해라

        int sum = 0;//합은 0부터 시작

        for (int i = 1; i <= 100; i++) {//1.
            if (i % 3 == 0) {//2.
                sum += i;
            }
        }
        System.out.println(sum);


    }


}



