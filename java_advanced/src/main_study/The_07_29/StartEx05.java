package main_study.The_07_29;

public class StartEx05 {
    public static void main(String[] args) {
        for (int i = 1; i<= 5; i++) {
            for (int j= 1; j<=i ; j++) {
                System.out.print("_");
            }//_ 언더바 찍기

            for (int star = 0 ; star< 5-i; star++) {
                System.out.print("*");
            } //*별찍기


            System.out.println();
        }

        }
    }
