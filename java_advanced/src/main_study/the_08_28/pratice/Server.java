package main_study.the_08_28.pratice;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  private static   ServerSocket serverSocket = null;
    //ServerSoccket 객체선언

    public static void main(String[] args)  {



        try {
            serverSocket = new ServerSocket(5000);//5000번포트로 연결대기 하는 객체 생성
            System.out.println("[서버]와 연결되었습니다.");
            Socket socket = serverSocket.accept();//5000번 포트로 연결
            serverSocket.close();//5000번 포트 종료
            System.out.println("연결종료");

        } catch (IOException e) {//예외 뜨면 에러로 출력
            System.out.println("Error");
        }



    }
}
