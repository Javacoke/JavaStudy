package main_study.The_07_29;

import java.util.Scanner;

public class 별만들기6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                //공백은 줄 번호보다 1작게
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }//별은 n-i+1개(하나씩 줄어들게 하고싶다!)
            System.out.println();
        }
    }
}
