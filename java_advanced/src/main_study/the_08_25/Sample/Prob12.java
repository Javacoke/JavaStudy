package main_study.the_08_25.Sample;

import java.io.*;

public class Prob12 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("numbers.dat");
        dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);

        dos.close();
        dos.close();
        dos.close();
        fos.close();

    FileInputStream fis = null;
    DataInputStream dis = null;
    fis = new FileInputStream("numbers.dat");
    dis = new DataInputStream(fis);

    int num1 = dis.readInt();
    int num2 = dis.readInt();
    int num3 = dis.readInt();

        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);

    dis.close();
    dis.close();
    dis.close();
    fis.close();






    }
}
