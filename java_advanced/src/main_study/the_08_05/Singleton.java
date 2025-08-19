package main_study.the_08_05;

public class Singleton {
    //싱글톤 클래스 객체를 담을 인스턴스 변수
    private static Singleton instance;

    //생성자를 private 선언 (외부에서 new 못하게)

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();

        }


        return instance;


    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();


        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s1==s2);
        System.out.println(s1==s3);

    }

}
