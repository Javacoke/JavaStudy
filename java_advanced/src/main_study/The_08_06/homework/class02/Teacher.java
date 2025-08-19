package main_study.The_08_06.homework.class02;

public class Teacher {
    private  String name="이순신";
    private  static int age;
    private static String subject;

    public  void setName(String name) {
        this.name = name;
    }

    public   String getName() {
        return name;
    }

    public static void setAge(int age) {
        Teacher.age = age;
    }

    public static int getAge() {
        return age;
    }

    public  void setSubject(String subject) {
        Teacher.subject = subject;
    }

    public static String getSubject() {
        return subject;
    }
    public void print(){
        System.out.printf("이    름: %s   나 이 : %d    담당과목:%s\n",name,age,subject);

    }

}
