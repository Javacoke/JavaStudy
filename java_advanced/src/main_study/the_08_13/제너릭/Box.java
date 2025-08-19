package main_study.the_08_13.제너릭;

public class Box extends Object {
    //Box 넣을 내용물을 content 필드 선언
    //Object 타입은 모든 클래스의 최상위 부모 클래스이므로 프로모션이 된다.
    //모든 객체는 부모 타입인 Object 로 자동타입 변환이 된다
    //content는 어떤 객체든 대입이 가능하다
   public Object content; //Object 모든타입을 받을 수 있는 슈퍼클래스

    public static void main(String[] args) {
        Box box = new Box();
        box.content = "바비인형";
        box.content = 100;
        box.content = 1000.088;
        //문제는 Box안의 내용물을 얻을 때 발생한다
        //conetent는 Object 타입이므로 어떤 객체가 대입되었는지 확실하게 알 수 없음.
        String doll = (String) box.content;
        //어떤 내용물이 저자오디었는지 모른다면 instanceof를 이용하여 타입조사를 할 수 있지만
        //타입을 싹다 조사할 수는 없다.


    }
}
