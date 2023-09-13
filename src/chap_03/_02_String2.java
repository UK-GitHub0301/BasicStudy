package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 반환
        System.out.println(s.replace(" and", ","));//" and"를 ","로 변경
        System.out.println(s.substring(7, s.length() - 1)); // "substring은 인덱스 기준 시작 위치 변경(이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));// 시작 위치 부터 끝 위치 "직전"까지
        System.out.println(s.substring(s.indexOf("Java"), s.length() - 1));

        //곱백 제거
        s = "                    I love Java.                ";
        System.out.println(s);
        System.out.println(s.trim());

        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.concat(" " + s2));
        System.out.println(s1.concat("," + s2));
        System.out.println(s1 + s2);
        System.out.println(s1 + " " + s2);
        System.out.println(s1 + "," + s2);
    }
}
