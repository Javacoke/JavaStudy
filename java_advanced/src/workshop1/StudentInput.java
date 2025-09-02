package workshop1;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Scanner;

public class StudentInput {
    // 사용자에게 입력 받아서 파일에 저장한다.
    //입력은 이름,국영수과의 점수
    // 출력은 student.data 템프폴더에 있는 파일에 한다.
    // 해쉬 맵(키와 데이터 한 세트로 저장) 형식으로 저장
    static String filepath = "C:/Temp/student.dat";//요구된 저장장소로 데이터 저장
    static HashMap<String, Student> students = new HashMap<>(); //학생의 이름을 키로 가진 해쉬맵 생성
    static File file = new File(filepath);// 파일의 객체 생성
    static Scanner sc = new Scanner(System.in);//아무래도 계산을 해야 됨으로 스캐너 사용

    public static void Inputstudent() {
        while (true) {
            System.out.print("이름: ");
            String name = sc.nextLine();
            if (name.equals("^^")) {
                System.out.println("입력을 종료합니다.");
                break;
            }

            if (students.containsKey(name)) {
                System.out.println("[오류] 이미 존재하는 이름입니다. 다른 이름을 입력하세요.");
                continue;
            }

            List<Integer> record = inputScore(); // 과목 점수 입력
            Student student = new Student(name, record);
            StudentGradeCalculator.calculate(student);

            students.put(name, student);

            System.out.printf("=> 저장됨: %s (총점=%d, 평균=%.1f, 학점=%s)\n",g
                    name, student.getTotal(), student.getAverage(), student.getGrade());
        }
    }

    public static void loadCheck() {//메서드는 메인 밖에서
        if (file.exists()) {
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);//파일에 객체를 만듬
                students = (HashMap<String, Student>) ois.readObject();//모든 타입을 받을 수 있는 오브젝트타입 활용
                ois.close();//사용했으니 꺼라
                fis.close();
                System.out.println("로드 완료");
            } catch (FileNotFoundException fnfe) {
                System.out.println("파일을 찾을 수 없습니다: " + fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println("입출력 오류 발생: " + ioe.getMessage());

            } catch (Exception e) {
                System.out.println("알 수 없는 오류 발생: " + e.getMessage());
            }

        }
    }

    public static int getValidScore(String subject) {//성적입력 유효성 검사
        while (true) {
            System.out.print(subject + ": ");
            try {
                int score = Integer.parseInt(sc.nextLine());
                if (score >= 0 && score <= 100) ;
                else System.out.println("[오류] 0~100 사이의 정수만 입력하세요.");
            } catch (NumberFormatException e) {
                System.out.println("[오류] 숫자만 입력하세요.");
            }
        }
    }

    public static List<Integer> inputScore() {//점수 리스트 타입 입력장치
        List<Integer> record = new ArrayList<>();
        record.add(getValidScore("국어"));
        record.add(getValidScore("영어"));
        record.add(getValidScore("수학"));
        record.add(getValidScore("과학"));
        return record;
    }

    public static void main(String[] args) {
        StudentOuntput.printUsage();
        loadCheck();
        Inputstudent();

    }


}


