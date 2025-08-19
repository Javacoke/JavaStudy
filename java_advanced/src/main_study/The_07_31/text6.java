package main_study.The_07_31;

public class text6 {
    public static void main(String[] args) {


        int n = 5;// 5줄 만들거야

        for (int i = 1; i <= n; i++) { //5칸을 넘으면 안됨
            for (int j = 1; j <= n - i; j++) {//1줄에는 4개 필요하고 2줄에는 3개필요하고...
                System.out.print(" ");//공백을 채워

            }
            for (int a = 1; a <= i; a++) {//1줄부터시작 1개필요
                System.out.print("*");//별을 그려

            }
            System.out.println(); //줄바꿔
        }

    }
}