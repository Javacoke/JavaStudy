package main_study.the_08_25.Sample;



public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    public Student() {
    }//디폴트 생성자 기본 생성자 클래스를 불러서

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}