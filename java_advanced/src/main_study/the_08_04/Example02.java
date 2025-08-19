package main_study.the_08_04;

public class Example02 {

    public static String greeting() {
        String greeting = "Hello";
        return greeting;//요것이 백앤드여
    }

    public static void main(String[] args) {
        String greeting = greeting();
        System.out.println(greeting);
        System.out.println(greeting + "Java");

        System.out.println(greeting()+"자바 프로그래밍");
    }


}
