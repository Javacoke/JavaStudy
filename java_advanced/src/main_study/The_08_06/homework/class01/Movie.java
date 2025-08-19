package main_study.The_08_06.homework.class01;

public class Movie {

    public String title ;//영화명을 나타내는 데이터

    public String genre ;//영화명을 지정하는 데이터



    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void play(){
        System.out.println(title+"("+genre+")상영중입니다.");
    }


}
