package main_study.The_08_06.homework.class02;

public class Student {

    private String name="홍길동";// 잠그고
    private int age;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public String getNAME() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void print() {
        System.out.printf("이    름: %s   나 이 : %d    학   번:%d\n",name,age,id);
    }
}