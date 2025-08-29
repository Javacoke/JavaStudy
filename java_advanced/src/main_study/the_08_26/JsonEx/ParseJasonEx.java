package main_study.the_08_26.JsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//JSON 에서 속성 순서는 중요하지 않아 추가한 순서대로 작성하지 않아도 상관없습니다.
//그리고 줄바꿈 처리도 되지 않습니다. 네트워크의 전송량을 줄여주어 오히려 이 점이 장점이 되었다.
//.json 파일을 파싱하는 방법을 실습하겠습니다.
public class ParseJasonEx {
    public static void main(String[] args) {
        // 1. 파일로부터 Json 읽어오기(제이슨씨 데려와서)
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("sym.json"))) {//맨손으로는 느리닌깐 망치 하나 준다
            String json = bufferedReader.readLine();

            JSONObject root = new JSONObject(json);

            System.out.println("아이디" + root.getString("name"));
            JSONObject obj = root.getJSONObject("tell");
            System.out.println("hom-tell:" + obj.getString("home"));
            System.out.println("hom-tell:" + obj.getString("mobile"));


            JSONArray skill = obj.getJSONArray("skill");
            for (int i = 0; i < skill.length(); i++) {
                System.out.println(skill.getString(i) + "");
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //


    }
}
