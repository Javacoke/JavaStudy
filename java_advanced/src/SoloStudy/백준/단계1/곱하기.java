package SoloStudy.백준.단계1;

import java.util.Scanner;


    public class 곱하기 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A<0||B>10){
                return;

            }
            System.out.println(A*B);
        }

    }

