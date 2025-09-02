package workshop1;

import java.io.Serializable;

import java.util.List;


public class Student implements Serializable {
    // 학생 1명의 성적 정보를 표현하는 직렬화 가능한 도메인 클래스
    // 기능 분담에 의한 데이터 클래스 기능만을 담당
    private static final long serialVersionUID = 1L;// 직렬화 호환이 가능해야함
    private String name; //이름 문자열
    private List<Integer> record;// 과목 점수는 Integer
    private int total;//총합
    private double average;//평균
    private String grade;//학점

    public Student(String name, List<Integer> record) {//생성자
        this.name = name;
        this.record = record;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Integer> getRecord() {
        return record;
    }



    public void setRecord(List<Integer> record) {
        this.record = record;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {// 총합
        this.total = total; // 총합의 값을 받는 저장소
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {//평균
        this.average = average; //평균의 값을 받는 저장소
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {//학점
        this.grade = grade; //학점의 값을 받는 저장소
    }

    public String toString() {// 우리가 원하는 값을 원하는 모양으로 출력 가능
        return String.format("""
                이름: %s 국어: %d 영어: %d 수학: %d 과학: %d
                총점: %d 평균: %.1f 학점: %s
                """, name, record.get(0), record.get(1), record.get(2), record.get(3), total, average, grade);

    }
}


