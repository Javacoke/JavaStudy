package main_study.the_08_26.JsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.StringWriter;
import java.io.Writer;

public class CreateJson {
    public static void main(String[] args) {
        //1.JSON 객체 생성
        JSONObject root = new JSONObject();
        //2.속성 추가
        root.put("id","singun0227");
        root.put("name","신건");
        root.put("password","1q2w3e4r!!");

        //3.복합속성 추가
        JSONObject tel = new JSONObject();
        tel.put("home","18688888888");
        tel.put("mobile","010-5456-4222");
        tel.put("phone","18688888888");
        root.put("tel",tel);

        JSONArray skill = new JSONArray();
        skill.put("Java");
        skill.put("Python");
        skill.put("JavaScript");
        root.put("skill",skill);
        //4. JSON 얻기
        String json = root.toString();
        //5. 콜솔에 출력
        System.out.println(json);
        //6. 파일에 출력
       try( Writer writer = new FileWriter("sym.json")){


        } catch (Exception e){
           System.out.println(e.getMessage());
       }




    }
}
