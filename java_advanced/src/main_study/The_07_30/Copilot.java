package main_study.The_07_30;

public class Copilot {
    public static void main(String[] args) {

        /*String name1 = "지민";
        String name2 = "유나";
        String name3 = "철수";
        100명이면 감당안됨*/


        //그래서~~
        String[]names = new String[3];// 이름 3개를 저장할 수있는 배열
        //String[]=여러 개 담을 수있는 상자
        //names= 이 상자 묶음의 이름
        //new String[3] 그 상자를 [3]칸짜리로 만듬
        //
        //  names
        names[0]="지민"; //첫 번째 칸
        names[1]="유나"; //두 번째 칸
        names[2]="철수"; //세 번째 칸
        //숫자 붙은 괄호 [0], [1],[2]가 바로 몇 번째 칸인지 나타내는 번호야
        for (int i = 0; i < names.length; i++) {
            // int i=0 i는 숫자에요. 처음엔 0으로 시작하구요
            // names.length 이름상자 몇 칸있어요? 3칸있네요
            // i++ i는 하나씩 증가해요
            String name = names[i];


        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("안녕,"+ names[i]+"!");
            //이름 세개 입력다 끝나면 출력해야하기 때문에 따로 적는다.
        }




    }
}
