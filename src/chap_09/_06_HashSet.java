package chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // Set은 ( list 값에 중복 허용하지 않습니다....)
        // 그릭 순서로 보장 하지 않습니다.
        HashSet<String> set = new HashSet<>();

        //데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        //순회
        for (String s : set) {
            System.out.print(s + " ");
            System.out.println();
        }
        System.out.println("----------------------------");

        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("----------------------------");
        //삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size());//7
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size());//7
        System.out.println("----------------------------");

        //전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 살품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("----------------------------");
        // 세트는 중복도 허용하지 않고 순서로 또한 일정하지 않습니다.

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (Integer i : intSet) {
            System.out.println(i);

        }

    }
}
