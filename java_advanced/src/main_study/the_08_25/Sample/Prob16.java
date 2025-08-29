package main_study.the_08_25.Sample;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고
// 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {


    public static void main(String[] args) {
        //배열 3명짜리 객체를 생성한다
       /* Student[] student =
                {new Student("박민수",20,3.2),
                       new  Student("김철수",21,3.5),
                         new Student("이영희",22,3.9)
                };*/
 List<Student> students = new ArrayList<Student>();//컬랙션 공부하기
 students.add(new Student("박민수",20,3.2));
 students.add(new Student("김민수",20,3.2));
 students.add(new Student("이민수",20,3.2));

        for (Student student : students) {
            System.out.println(student.getName());
        }

//        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))){
//
//
//
//
//
//
//
//
//        } catch (Exception e) {
//          e.printStackTrace();
//        }




    }
}