package chap_01;

public class _05_VariableNaming
{
    public static void main(String[] args)
    {
        // 변수 이름 지정 방법
        // 1. 저장할 값에 어울리는 이름으로 지정 **
        // 2. 밑줄, 문자, 숫자, 사용 가능합니다.(공백 사용 불가)
        // 3. 밑줄, 또는 문자로 시작 가능(숫자로 시작 불가)
        // 4. 한 단어 또는 2개 이상의 단어의 연속으로 지정
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(시작 단어는 제외)_CamelCase
        // 6. 예약어는 사용 불가(public, static, int, double, float, ...)
        //

        System.out.println("example#1");
        // 입국 신고서(여행)
        String nationality = "대한민국"; //국적
        String firstName            = "현성"; // 이름
        String lastName             = "김"; // 성
        String dataOfBirth          = "2001-12-31"; //생년월일
        String residentialAddress   = "무슨 호텔"; //체류지
        String purposeOfVisit       = "관광"; //입국목적
        String flightNo = "KE657"; //항공편명
        String _flightNo = "KE657"; //항공편명 **
        String flight_no_2 = "KE657"; //항공편명(x)
        // String flight-no-2= "KE657"; //항공편명
        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간
        String item1 = "시계";
        String item2 = "가방";
        //String 3item="전자제품";

        // 프로그램의 흐름을 위해 사용되는 경우 등( 크게 이름이 중요하지 않는 경우)

        int i = 0;
        String s = "";
        String str = "";

        //절대 변하지 않는 상수는 대문자로
        final String CODE ="KR";
        //CODE = "test";

    }
}
