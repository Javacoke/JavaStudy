package main_study.the_08_13;

import main_study.the_08_13.MyResource;

public class TryWithResourceEx {

    public static void main(String[] args) {
        try(main_study.the_08_13.MyResource resource = new MyResource("AAA")) {
//            String data = new MyResource();
        }catch (Exception e){
         System.out.println("예외처리 : " + e.getMessage());
     }
    }
}
