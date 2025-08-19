package SoloStudy.김영한씨_반복문;

public class 문제3 {
    public static void main(String[] args) {
        int max= 100;//
        int sum=0;//합은 0부터시작
        int i=1;//1부터 시작
        while (i<=max){
            sum+=i;//더하기 할때마다 +i추가
            i++;//i는 1씩추가
            System.out.println(sum);
        }

    }
}
