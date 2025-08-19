package main_study.the_08_04.oop;

public class 학생 {
    //학생 멤버 (필드)
    private String stu_name;
    private Integer stu_old;
    private String stu_add;
    private String stu_num;
    private Integer korean;
    private Integer english;
    private Integer math;
    private Integer every;

    //생성자 메소드를 통하여 학생의 객체의 필드를 초기화
    //학생(){} //기본 생성자
    학생(String stu_name, String stu_num) {
        this.stu_name = stu_name;
        this.stu_num = stu_num;
    }
    학생(String stu_name, Integer stu_old,String stu_add, String stu_num,
       Integer korean, Integer english, Integer math){


        this.stu_name = stu_name;
        this.stu_num = stu_num;
        this.stu_old = stu_old;
        this.stu_add = stu_add;
        this. korean = korean;
        this.english = english;
        this.math = math;
    }
    @Override
    public String toString(){//출력문
        return "학생{" +
                "stu_name="+stu_name+'\''+
                ", stu_age="+stu_old+
                ", stu_add='" +stu_add+'\''+
                ",stu_num'"+stu_num+'\''+
                ",korean="+korean+'\''+
                "' english=" + english+'\''+
                "' math=" +math+'\''+
                "'every='"+(korean+english+math)+'}';





    }





}
