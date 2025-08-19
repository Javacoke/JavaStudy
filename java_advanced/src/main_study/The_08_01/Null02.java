package main_study.The_08_01;

//똑같은 변수 a의 주소값을 출력하였다.
//문자열이 변경됨에 따라 주소값이 바뀌어 있음을 확인
//즉 문자열 값 자체는 불변이라 변경할 수 없기 때문에 새로운 문자열 데이터 객체를 대입하여 새로운 공간에 값이 할당한다.
//ex) 집을 지었는데 집의 구조를 바꾸고 싶으면 재건축해야한다. 리모델링 불가
public class Null02 {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());

        a += "Java Programming";
        System.out.println(a.hashCode());
        System.out.println(a);
    }
}
