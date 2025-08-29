package main_study.the_08_26.오전문제.Q1;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String FileName = "person.dat";//파일이름은 정해진걸로

        //요거를 입력할거야
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileName))) {
            Person p = new Person("홍길동", 30);
            oos.writeObject(p);
        } catch (IOException e) {
            System.out.println("고장났어요");//예외처리해야해요
        }


        //받은거 토해
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileName))) {
            ois.readObject();
            Person p = (Person) ois.readObject(); //Person 타입 강제캐스팅
            System.out.println(p);
        } catch (ClassNotFoundException | IOException _) {
            System.out.println("고장");
        }


    }
}
