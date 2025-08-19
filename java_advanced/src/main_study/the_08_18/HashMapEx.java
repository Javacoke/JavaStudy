package main_study.the_08_18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();
        //map이라는 창조 변수 만들었다. 키랑 값이랑 붙어다닌다

        //객체저장(INSERT,CREATED.SAVE)
        map.put("A", 1);//A는 키다
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        int value1 = map.put("D", 1);

        System.out.println(map.size());//키값이 동일하면 한개로 취급한다.
//   객체 읽기 (Read, Get) ==> Key를 이용하여 읽기
        String key = "A";//하나씩할때
        int value = map.get(key);
        System.out.println("키를 이용하여 값 확인" + value);
        System.out.println();

//        키 Set 컬렉션을 얻고, 반복해서 키와 값을 읽고 싶다.
        Set<String> keyset = map.keySet();// 반복자로 싹다 가져올때
        Iterator<String> iterator = keyset.iterator();//키를 반복하기 위해 반복자를 생성
        while (iterator.hasNext()) {
           String key1 = iterator.next();
           Integer value2 = map.get(key1);
            System.out.println(key1+" : "+ value2);

        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key1 = entry.getKey();
            Integer value2 = entry.getValue();
            System.out.println(key1+" : "+ value2);
            System.out.println();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key1 = entry.getKey();
            Integer value2 = entry.getValue();
            System.out.println(key1+" : "+ value2);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("B");
        System.out.println(map.size());
        System.out.println();

    }
}
