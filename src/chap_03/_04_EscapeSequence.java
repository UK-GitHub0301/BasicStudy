package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자. 이스케이프 문자(Escape Sequence, Escape Character, Special Character)
        //
        // '\n' :  줄 바꿈 문자
        //변경 전
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재미있어요");
        System.out.println("--------------------------------");

        // 변경 후
        System.out.println("자바가\n너무\n재미있어요");


        System.out.println("--------------------------------");
        // '\t' : 탭 적용

        // 해물파전      9000원
        // 김치전      8000원
        // 부추천      8000원
        System.out.println("해물파전\t\t9000");
        System.out.println("김치전\t\t8000");
        System.out.println("부추전\t\t8000");

        // "\\" : 역슬래시 적용
        System.out.println("C:\\Program Files\\Java");

        // \" : "를 출력
        System.out.println("단비가 \"냐옹\" 이라고했어요");

        // \' : '를 출력
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
