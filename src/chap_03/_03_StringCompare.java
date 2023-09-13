package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {


        //문자열 비교

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));// 문자열 s1과 s2가 같은지
        // 판단하는 메소드 만약에 같다면 true, 다르다면 false (true)
        System.out.println(s1.equals("Java"));// 문자열 s1과 s2가 같은지
        // 판단하는 메소드 만약에 같다면 true, 다르다면 false (true)
        System.out.println(s2.equals("python"));// 문자열 s1과 s2가 같은지
        // 판단하는 메소드 만약에 같다면 true, 다르다면 false (false)

        System.out.println(s2.equalsIgnoreCase("java")); //대소문자 구별없이 문자와 비교
        // content내용이 같은지 판단하는 메소드

        // 문자열 비교 심화
        //벽에 붙은 메모지의 비밀번호
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true 반환(내용)

        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));// true
        System.out.println(s1 == s2); //false
    }
}
