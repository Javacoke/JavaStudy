package main_study.the_08_05;
//16번 꼭보기
public class Printer {



    public static void println(int value){

        System.out.println(value);
    }
    public void println(boolean value){

        System.out.println(value);
    }
    public void println(double value){

        System.out.println(value);
    }
    public void println(String value){

        System.out.println(value);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer.println(10);//static 변경
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }




}
