package main_study.the_08_25.Sample;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 문제 2: 텍스트 파일에 저장된 문자열 읽기
//         hello.txt 파일을 읽어 화면에 출력하세요.
public class Prob2 {

    public static void main(String[] args) throws IOException {
        Reader reader=null;

        reader = new FileReader("C:/Temp/prob1.txt");
         while (true) {
             int data = reader.read();
             if (data == -1) break;
             System.out.print((char) data);



         }
reader.close();

    }
}
