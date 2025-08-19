package main_study.the_08_12;

import main_study. the_08_12.A;
import main_study.the_08_12.B;
import main_study.the_08_12.C;
import main_study.the_08_12.D;
import main_study.the_08_12.E;

public class Users {

    public static void main(String[] args) {
        main_study.the_08_12.B b = new B();
        main_study.the_08_12.C c = new C();
        main_study.the_08_12.D d = new D();
        main_study.the_08_12.E e = new E();


        A a;
        a = b;
        a = (A) c;
        a = d;
        a = (A) e;


    }
}
