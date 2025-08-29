package main_study.the_08_26;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.*;

import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable{
   private String name;
private int age;
}
@NoArgsConstructor
@AllArgsConstructor
@Data
class Product implements Serializable{
  private    String pname;
   private int price;
}
// 자바는 메모리에 생성된 객체를 팡리 또는 네트워크로 출력할 수있다.
// 객체를 입출력 할 수있는 보조 스트림
// ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화)
// ObjectOutputStream(바이트 스트림과 연결되어 객체로 복원하는 직렬화)
public class ObjectInOutEx {
public static void main(String[] args) throws Exception {

    //1. C:/Temp/object.dat 에 파일 객체에 파일 입력 스트림 객체를 생성해 주세요
    FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
    //2. 생성된 파일입력스트림 객체에 객체 객체 출력 스트림 객체를 끼워주세요
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    //3. 객체 생성
    User user = new User("신세계",20);
    Product product = new Product("삼성노트북",1500000);
    int[] arr1 = {10,20,30};
    List  <Product> products = Arrays.asList(product);
      //4. 위 4개의 객체를  object.dat 파일에 저장
    oos.writeObject(products);
    oos.writeObject(arr1);
    oos.writeObject(product);
    oos.writeObject(user);
    //5.
    oos.flush();
    oos.close();
    fos.flush();
    fos.close();


    //파일에서 읽어서 객체를 복원하세요
   FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    try{
        while(true){
            Object obj = ois.readObject();
            System.out.println(obj);
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}










}

