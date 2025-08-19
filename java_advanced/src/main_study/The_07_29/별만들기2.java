package main_study.The_07_29;

public class 별만들기2 {
    public static void main(String[] args) {

        //별삼각형만들기

        for (int i=1 ; i<=5;i++){//줄이 5개니까 1줄부터 5줄 반복해
            //줄 수를 만드는 반복문
            for (int j =1 ; j<=i; j++){//i번째 줄이면 별을 i개 찍어야해
                //별을 찍는 반복문
                System.out.print("*");
            }//가로로찍어
            System.out.println();//다음줄

        }

    }

}
