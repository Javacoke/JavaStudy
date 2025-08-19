package main_study.The_07_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForSample04 {
    public static void main(String[] args) throws IOException {
    //이건 또 뭐야
        System.out.println("몇개의*를 출력하겠습니까?");
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));
    //이건 또 뭔데
        String str = br.readLine();//이건 또 뭐꼬
        int num =Integer.parseInt(str);//옘병

        for(int i=1; i<=num; i++) {
            System.out.println("*");
        }

        }
} //별이 왜 세로로 나오는데
