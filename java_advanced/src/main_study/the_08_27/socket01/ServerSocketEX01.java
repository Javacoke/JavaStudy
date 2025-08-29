package main_study.the_08_27.socket01;

import java.io.IOException;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketEX01 {

    private static ServerSocket serverSocket = null;



    public static void main(String[] args) {


        System.out.println("-----------Starting server socket----------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter키를 입력하세요");
        System.out.println("--------------------------------------------------");

        //TCP 서버 시작
        startServer();

        //키보드 입력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) break;
        }


        //TCP 서버 종료
       stopServer();

    }

    public static void startServer() {
        //스레드 Tread : 실행단위 나중에 다시 배운다
    Thread thread = new Thread() {
        @Override
        public void run() {

            try {
                serverSocket = new ServerSocket(50001);
                System.out.println("[서버] 시작됨!");
                while (true) {
                    System.out.println("\n[서버] 연결 요청을 기다립니다.\n");
                    //연결 수락
                    Socket socket = serverSocket.accept();

                    //연결된 클라이언트의 IP정보 얻을 수 있다.
                    InetSocketAddress ia = (InetSocketAddress)socket.getRemoteSocketAddress();
                    System.out.println("[서버]"+ia.getAddress()+":"+ia.getPort());
                    // public static void startServer() 부터 여기까지 start 스레드이다
                }




            } catch (IOException e) {
                System.out.println("고장났습니다.");
            }
        }
    };
        thread.start();
    }

    public static void stopServer() {}









}
