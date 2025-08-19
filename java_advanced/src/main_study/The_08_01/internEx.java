package main_study.The_08_01;

// intern() : 문자열을 최적화 관리를 위한 메소드
//문자열을 리터럴로 선언할 경우 내부적으로 String의 intern() 메소드가 호출이 된다.
//해당 리터럴이 문자열상수 pool안에 존재하는지 확인,
// 만약 존재하면 해당 pool의 리터럴을 리턴한다.
// 존재하지 않는다면 리터럴을 pool안에 집어넣고 새로운 주소값을 변환한다.
//iter() equals()없이 문자열 비교가 가능하다


public class internEx {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String(new char[]{'H','e','l','l','o'} );//.itern();

        System.out.println();

        String str3 = new String("Hi");
        String str4="Hi";

        str3= str3.intern();
        System.out.println(str4==str3);

    }


}
