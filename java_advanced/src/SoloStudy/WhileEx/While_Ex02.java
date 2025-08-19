package SoloStudy.WhileEx;

public class While_Ex02 {
    public static void main(String[] args) {
        //1~100까지 합을 출력하는 프로그램
        int loop =1;
        int sum=0;//합값 저장공간
        while(loop<=100){
        sum+=loop;
        loop++;}
        System.out.println("1~100의 합 = "+sum);

    }

}
