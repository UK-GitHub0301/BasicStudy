package chap_03;

// 주민등록번호는 13자리의 숫자로 구성
// 앞 6자리는 생년월일 정보, 뒷 7자리중 첫 번째 숫자는 성별 정보
// 입력 데이터는 -을 포함한 14자리 문자열 형태
// "901231-1234567"인 경우 901231-1 까지 출력
// "030708-4567890"인 경우 030708-4 까지 출력

public class _Quiz_03 {


    public static void main(String[] args) {
        String num1 = "901231-1234567";
        String num2 = "030708-4567890";
        System.out.println(num1.substring(0,8));
        System.out.println(num2.substring(0,8));
    }
}
