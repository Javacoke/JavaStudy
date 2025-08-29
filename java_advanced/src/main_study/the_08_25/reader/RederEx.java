package main_study.the_08_25.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RederEx {
    public static void main(String[] args) throws IOException {// 기능부터 만들꺼야

        Reader reader = null;

        //1. 문자 하나씩 읽기

        reader = new FileReader("C:/Temp/testChar.txt");
        while (true) {
            int data = reader.read();
            if (data == -1) break;
            System.out.print((char) data);
        }

        reader.close();
        System.out.println();

        //2. 문자배열로 읽기
        reader = new FileReader("C:/Temp/testChar.txt");
        char[] datas = new char[100];

        while (true) {
            int numRead = reader.read(datas);
            if (numRead == -1) break;
            for (int i = 0; i < numRead; i++) {
                System.out.print(datas[i]);

            }
            }

        reader.close();//꼭사용한 스트림 닫기


        }

    }



