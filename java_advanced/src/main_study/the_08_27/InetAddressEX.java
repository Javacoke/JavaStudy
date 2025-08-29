package main_study.the_08_27;

import java.net.InetAddress;
import java.net.UnknownHostException;
//자신의 컴퓨터의 IP 주소 얻는법2
public class InetAddressEX {
    public static void main(String[] args)  {

        InetAddress inetAddress = null;

        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 IP 주소값"+inetAddress);
            InetAddress[] inetAddresses = InetAddress.getAllByName("www.google.com");
        for (InetAddress Address : inetAddresses) {
            System.out.println();
        }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }


    }
}
