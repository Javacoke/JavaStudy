package main_study.The_07_29;

public class StartEx03 {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j > i; j--) {
                if (i < j) {//공백
                    System.out.println(" ");
                } else {
                    System.out.println("*");
                    System.out.println();
                }

            }
        }
    }
}