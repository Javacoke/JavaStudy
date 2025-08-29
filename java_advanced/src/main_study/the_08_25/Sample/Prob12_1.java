package main_study.the_08_25.Sample;

import java.io.*;

public class Prob12_1 {
    public static void main(String[] args) throws IOException {
        //numbers.dat 파일에 정수데이터를 써야 하므로 FileOutputStream fos 객체 생성
        FileOutputStream fos = new FileOutputStream("numbers.dat");
        //성능을 높이기 보조스트림 ==> DataOutStream(fos) 사용
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);
        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("numbers.dat");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println();




    }
}
