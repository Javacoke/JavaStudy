package main_study.the_08_27.socket01;

import java.io.IOException;
import java.net.Socket;


public class ClaimentSocketEx01 {

    public static void main(String[] args) {
       //Socket 생성과 동시에 localhost 또는 IP의 Port의 연결 요청
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("Connected to server 성공");

            socket.close();
            System.out.println("연결종료");

        } catch (IOException e) {
            System.out.println("연결오류");;
        } ;
        }
}
