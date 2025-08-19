package main_study.The_07_30;

public class 배열_연습문제2 {


    public static void main(String[] args) {
    //1. 26개의 알파벳 대문자를 A~Z 까지 차례로 입력
    //1-1. 동일한 데이타입  char 연속된 값을 저장=> 배열
        char[] 알파벳 = new char[26];//배열은 길이를 먼저 정하고 생성 해야 한다.
    //1-2. 문자형 배열을 선언하고 차례차례 A~Z까지 값을 대입하여 저장
        for (int i = 0; i < 알파벳.length; i++) {
            알파벳[i]= (char)('A'+i);

        }
        System.out.println();
        System.out.println("====전통 for 방식으로 인덱스를 조정하여 끝부터 처음까지 출력=========");
        for (int i = 알파벳.length-1; i >=00; i--) {
            System.out.printf("%c",알파벳[i]);

        }


        for (char c : 알파벳) {
            System.out.printf("%c",c);

        }
        System.out.println();
        System.out.println("====전통 for 방식으로 인덱스를 조정하여 끝부터 처음까지 출력=========");

        //1-3. 배열의 마지막부터 처음까지 각문자 출력













    }
}
