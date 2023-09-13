package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵(Key, Value)로 이루어진 배열을 말 합니다.**

        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("", 10);
        map.put("박명수", 20);
        map.put("김종국", 3);
        map.put("정준하", 25);
        map.put("서장훈", 22);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("-------------------------------------");

        // 데이터 조회

        System.out.println("유재석님의 포인트" + map.get("유재석"));
        System.out.println("정준하님의 포인트" + map.get("정준하"));

        System.out.println("-------------------------------------");

        // 데이터 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록( 포인트1 )");

        }

        //데이터 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        //데이터 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수는 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("-------------------------");


        // 다시 고객이 돌아옴
        map.put("유재석", 10);
        map.put("박명수", 20);
        map.put("김종국", 3);
        map.put("정준하", 25);
        map.put("서장훈", 22);

        // 데이터 키 값 순회
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("-----------------------");

        // 데이터 value 값 순회
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println("----------------------------");

        // Key & Value 한번에 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + " 님의 포인트는 : " + map.get(key));
        }
        System.out.println("-----------------------");

        // 맵: 중복 x, 순서x
        map.put("서장훈", 22);
        map.put("서장훈", 30);
        map.put("서장훈", 12);
        map.put("서장훈", 15);
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + " 님의 포인트는 : " + map.get(key));
        }
        System.out.println("-----------------------");
    }

}
