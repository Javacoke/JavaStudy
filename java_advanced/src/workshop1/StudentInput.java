package workshop1;


import java.io.*;

import java.util.HashMap;
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


    public static void printUsage() {//설명서 나오는 메서드
        System.out.println("학생 성적 입력 프로그램입니다.");
        System.out.println("종료를 원하시면 F를 눌러주세요");
        System.out.println("점수는 0~100사이의 정수만 가능합니다.");

    }

    //호환성

    public static void main(String[] args) {
        loadCheck();
        printUsage();
    }    // 메서드들을 여기에 차례로 호출}
    //파일이 존재하면 기존 데이터를 불러오고, 없

}