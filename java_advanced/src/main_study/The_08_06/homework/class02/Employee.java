package main_study.The_08_06.homework.class02;

public class Employee {

    private  String Name="유관순";
    private  int  age;
    private  String dept;

    public  void setName(String name) {
        this.Name = name;
    }

    public  String getName() {
        return Name;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public  int getAge() {
        return age;
    }

    public  void setDept(String dept) {
        this.dept = dept;
    }
    public  String getDept() {
        return dept;
    }
    public void print(){
        System.out.printf("이    름: %s   나 이 : %d    부   서 :%s\n",Name,age,dept);
    }

}
