package main_study.The_08_06.homework.class01;

import main_study. The_08_06.homework.class01.Movie;

public class TestMovie {

    public static void main(String[] args) {
        main_study. The_08_06.homework.class01.Movie myMovie = new main_study.The_08_06.homework.class01.Movie();
        myMovie.setTitle("어거스트 러쉬");
        myMovie.setGenre("Drama");
        myMovie.play();

        System.out.println("--------------------");

        main_study.The_08_06.homework.class01.Movie yourMovie = new Movie();
        yourMovie.setTitle("나는 전설이다.");
        yourMovie.setGenre("SF");
        yourMovie.play();
    }

}
