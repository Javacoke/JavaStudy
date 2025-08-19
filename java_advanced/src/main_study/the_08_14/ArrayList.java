package main_study.the_08_14;

import java.util.LinkedList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String>list1= new java.util.ArrayList<>(); //ArrayList 컬렉션 객체 생성
        List<String>list2= new LinkedList<>();//LinkedList 컬렉션 객체 생성

    //시작시간과 끝시간을 저장할 변수
        Long startTime,endTime;

        //AarryList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0,String.valueOf(i));


        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 데이터 삽입시간 :", (endTime-startTime));
    }

}
