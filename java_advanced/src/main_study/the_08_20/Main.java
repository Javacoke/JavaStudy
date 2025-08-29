package main_study.the_08_20;




class Person{
    private Phone phoneNumber;  //객체 생성시 초기화
    private String name;

    Person(String name){ this.name=name;    }

    public Phone getPhone() {
        return this.phoneNumber;}
}


class Phone{
    private OS os;

    public OS getOs() {
        return this.os;
    }
}

class OS {
    public String printOS(){
        return "IOS";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        person.getPhone().getOs().printOS();
    }
}