package main_study.The_07_31;

public class ex02 {
    public static void main(String[] args) {
        //1.초기화 하고
        //2.


        char[]c={'A','P','P','l','E'};

        char char1 = 'a';
        char1 = 65;
        System.out.println((char) char1);
        System.out.println("------------------------------------");


        c[0] = 65;
        c[1] = 80;
        c[2] = 80;
        c[3] = 76;
        c[4] = 69;

        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];
            System.out.println(c1);
        }


    }



}
