package workshop;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//log 저장소
public class Server {
    private static ServerSocket serverSocket=null;//서버소켓 선언

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("--------------------------------------------------------------------");
        //서버 종료 커맨드 만들기

        startServer();//클라이언트와 연결시작

        Scanner sc = new Scanner(System.in);//키보드 입력받기
        while(true) {
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("q")) {// q를 입력받으면 종료시키는 로직
                System.out.println("서버가 종료되었습니다.");
                break;

            }
        }
        sc.close();

        stopServer();

    }
    public static void startServer() {
        // 클라이언트 서버 연결 시작 메서드
        Thread thread = new Thread() { //스레드 정의
            @Override // 많은 스레드들을 정의
            public void run() {
                try {
                    serverSocket = new ServerSocket(5000);//포트 5000
                    System.out.println("[서버] 시작");

                    while (true) {//클라이언트에게 요청이 올때까지 대기상태 만들기
                        System.out.println("\n[서버] 연결 요청을 기다림\n");
                        Socket socket = serverSocket.accept();


                        //연결된 클라이언트 확인
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");


                        //1단계 일단 서버와 클라이언트 한개씩 연결
                        DataInputStream dis = new DataInputStream(socket.getInputStream());//데이터 받기
                        String message = dis.readUTF();

                        //데이터 보내기
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                     //클라이언트가 추가 될때마다 스레드 추가
                       Thread clientThread = new Thread(new ClientHandle(socket));
                        clientThread.start();







                    }


                } catch (IOException e) {
                    System.out.println("Error");
                }


            }


        }; thread.start();

                }
                public static void stopServer() {
                    try {
                        serverSocket.close();
                        System.out.println("[서버]종료");
                    } catch (IOException e1) {
                    }
                }
            }




