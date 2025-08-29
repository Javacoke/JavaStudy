package main_study.the_08_28.pratice;


import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost",5000);
            System.out.println("연결성공");


        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("연결종료");

    }
}
