package SoloStudy.김영한씨_반복문;

public class For문2 {
    public static void main(String[] args) {
        //endNumber까지 더해라
        int sum =0;//값을 누적할 장소
        int endNum = 3;

        //1+2+3 = 6
        //sum=1+2+3
        for (int i = 1; i <= endNum; i++) {
            sum =sum +i;
            System.out.println("i="+ i + "sum=" + sum);
        }



    }
}
