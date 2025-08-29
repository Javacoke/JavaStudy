package main_study.the_08_26.오전문제.Q1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Prob1 {
    public static void main(String[] args) {

        String filename = "person.dat";

        Person person = new Person("홍길동", 30);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
        oos.writeObject(person);

        }
        catch(IOException e){
        System.out.println("입출력예외 처리완료");
        } catch(Exception e){
            System.out.println("Exception 처리완료");
        }
    //역직렬화







    }
}