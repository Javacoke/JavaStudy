package main_study.The_07_28;

import java.util.stream.IntStream;

public class ForEx03 {
    public static void main(String[] args) {

        for(int i =1 ; i <=20; i++) {
            if (i % 2 == 1)//2로나누웠을때 나머지 1이 나오면
                System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("===========================");

        //도대체 람다가 뭐냐고 무슨 타이핑 교실도 아니고 타이핑만 치네
        IntStream intStream = IntStream.rangeClosed(1,20);
        intStream.filter(n-> n%2 ==1). forEach(e-> System.out.println(e + " "));
    //이게 뭐냐고~~~~~~~


    }
}
