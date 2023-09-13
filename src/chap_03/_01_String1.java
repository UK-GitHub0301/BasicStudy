package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Java")); //Java라는 단어가 포함되어 있다면 True 없다면 False(True)
        System.out.println(s.contains("C#")); //false
        System.out.println(s.indexOf("Java"));// Java라는 글자가 시작되는 위치
        System.out.println(s.indexOf("C#"));// 문자열이 포함 되지 않기 때문에 "-1"로 반환
        System.out.println(s.indexOf("and")); // 동일한 문자열 경우 제일 첫번째 위치 반환
        System.out.println(s.lastIndexOf("and"));// String내에 제일 마지막 String 위치 반환
        System.out.println(s.startsWith("I like"));// ()안에 내용으로 시작하는지 확인하는 메소드(참일경우 true, 아닐 경우 false)
        System.out.println(s.endsWith("."));//안에 내용으로 끝나는지 확인하는 메소드(참일경우 true, 아닐 경우 false)


    }
}
