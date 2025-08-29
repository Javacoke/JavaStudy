package main_study.the_08_27.socket01;

import java.net.ServerSocket;

public class ServerSocketEX01_1 {
    private static ServerSocket serverSocket= null;
    // 먼저 서버 소켓은 클라이언트가 연결요청한 것을 받기 위해서 필요한 변수를 serverSocket으로 받았다.
    // private: 연결을 함부러 해제시키지 못하게 하기 위해서 사용하였다.
    // static: 서버는 보통 하나의 소켓만 생성해서 계속 유지하므로 클래스 전체에서 접근하도록 사용했다.
    // null: 아직 소켓을 생성하지 않았기 때문에 초기화 했다.
    //P.S 전화 받은 직원과 같다 SeverSocket: 전화기/ accept(): 전화 받기 / Socket: 통화 연결된 상대방
    public static void main(String[] args) {
        //서버와 클라이언트를 연결 시킬거다


    }
}
