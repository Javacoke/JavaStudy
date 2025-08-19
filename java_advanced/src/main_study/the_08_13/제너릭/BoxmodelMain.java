package main_study.the_08_13.제너릭;


import main_study.the_08_13.제너릭.BoxModel;

public class BoxmodelMain {
    public static void main(String[] args) {
        //로켓 프레쉬 라인, 철호가 배추,무,상추, 삼겹살를 Box에 담고 box에 담긴 내용을 출력하세요
        main_study.the_08_13.제너릭.BoxModel<String> box = new BoxModel<>();//T가 정해짐
        box.content =new String[]{"배추","무","상추","삼겹살"};
        for (String content : box.content) {
            System.out.println(content + "\t");
        }




    }

}
