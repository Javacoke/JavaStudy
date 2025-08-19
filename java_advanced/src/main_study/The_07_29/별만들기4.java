package main_study.The_07_29;

public class 별만들기4 {
    public static void main(String[] args) {

        for (int i=1; i<=5;i++){//1부터5까지 줄세기
            for (int j=1; j<=5-i; j++){//빈칸 찍기(5-i개)
                System.out.print("");//빈칸은 그냥 스페이스 한칸

            }
            for (int j=1; j<=i; j++) {
                System.out.print("*"); //print 날 것 그대로
                                        //println 한줄 띈다
            }
            System.out.println();
        }


    }

}
