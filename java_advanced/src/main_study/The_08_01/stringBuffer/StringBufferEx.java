package main_study.The_08_01.stringBuffer;
//StringBuffer 주요 메서드

public class StringBufferEx {

    public static void main(String[] args) {

        String str ="abcdefg";
        StringBuffer sb = new StringBuffer(str);
        //StringBuffer를 String 타입으로 변환
        System.out.println("초기상태 : "+sb.toString());
        //sb 문자열에서 cd 문자를 추출 출력하세요
        System.out.println("문자열 추출 : "+sb.substring(2,4));

        //sb index 2에 "추가"문자열 삽입 하세요
        System.out.println("문자 추가 : "+sb.insert(2,"추가"));


        //sb에 문자열 삭제
        System.out.println("문자 삭제"+sb.delete(2,4));

        //sb에 문자 붙이기 : append()
        System.out.println("문자 붙이기 : "+ sb.append("hijk"));
        //append는 맨뒤에 넣으라는 뜻

        //sb의 길이 : length()
        System.out.println("문자열의 길이 : "+ sb.length());

        //문자열의 역순  : reverse()
        System.out.println("문자열의 역순 : "+ sb.reverse());

        //현상태 문자열 확인
        System.out.println("마지막 상태 체크 :"+sb);




    }
}
