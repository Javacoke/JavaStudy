package workshop;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientHandle implements Runnable {
 // 클라이언트핸들 클래스는 런어블 인터페이스를 사용한다.


    private Socket socket;
    //1. 통신에 사용할 소켓 객체를 저장할 변수를 만든다

    public ClientHandle(Socket socket) {
        this.socket = socket;
    }//2. 생성자를 만들어 서버로부터 소켓을 전달받는다

    @Override
    public void run() {//통신은 여기서
    //3. 런어블 인터페이스의 메서드를 만든다
        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 처리함");

        try (DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
            String message = dis.readUTF();
            System.out.println("[서버] 받은 데이터: " + message);
            //4.클라이언트가 보낸 메세지를 읽는다

            //5.반송
            dos.writeUTF(message);
            dos.flush();
            System.out.println("[서버] 받은 데이터를 다시 보냄:"+message);

            } catch (IOException e) {
            System.out.println("Error");

        }






        }
}
