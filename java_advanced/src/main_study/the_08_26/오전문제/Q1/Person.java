package main_study.the_08_26.오전문제.Q1;

import java.io.Serializable;

public class Person implements Serializable {//직렬화 여기있는 정보를 파일로 내보낼 수있게 변신해서 대기중
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {//toString 안하면 주소값을 출력
        return  name+","+age;
    }
}
