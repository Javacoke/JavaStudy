package main_study.the_08_13.GenericBase.FruitBox;

public class Orange {

    int sugarContent; //당도를 뜻하는 변수

    public Orange(int sugar ){ //생성자
        sugarContent = sugar;
    }

    public void showSugarContent(){
        System.out.println("당도 "+sugarContent);
    }



}
