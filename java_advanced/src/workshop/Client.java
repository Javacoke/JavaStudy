package workshop;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
       Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        try {
            Socket socket = new Socket("192.168.50.199",5000);
            System.out.println("[클라이언트] 연결 성공");
            String sendMessage = message;
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(message);
            dos.flush();
            System.out.println("[클라이언트]데이터 보냄: "+ sendMessage);

            socket.close();
            System.out.println("[클라이언트] 연결 끊음");

        } catch (IOException e) {
            System.out.println("Error");
        }


    }
}
