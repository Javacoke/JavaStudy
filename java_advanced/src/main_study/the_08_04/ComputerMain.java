package main_study.the_08_04;

import main_study.the_08_04.Computer;

public class ComputerMain {

    public static void main(String[] args) {
        //Computer 객체 생성
        main_study.  the_08_04.Computer myCom = new Computer();

        String result = null;

        result = myCom.totalSum(1, 2, 3);
        System.out.println(result);

        result = myCom.totalSum(1,2,3,4,5);
        System.out.println(result);

        int[] values = {1,2,3,4,5};
        result = myCom.totalSum(values);

        result = myCom.totalSum(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(result);

    }

}