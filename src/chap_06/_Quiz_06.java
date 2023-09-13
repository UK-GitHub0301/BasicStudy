package chap_06;

// 개인정보를 비공개로 전환하는 메소드 작성
// 하나의 메소드에서 모든 동작 처리
// 각 정보는 아래 위치부터 비공개 적용
// 이름 : 테스트->테**
// 주민등록번호 : 991030-1234567 ->991030-1******
// 전화번호 : 010-1234-5678 -> 010-1234-****
public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);

        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

//    public static String result(String str) {
//        String test = str.substring(0, str.indexOf("-"));
//        String test2 = str.substring((str.indexOf("-") + 1), str.length());
//        String[] str1 = {};
//        for (int i = 0; i < test.length(); i++) {
//            str1 += test[i];
//        }
//
//    }





    public static void main(String[] args) {
        String name = "테스트";
        String id = "991030-1234567";
        String phone = "010-1234-5678";
        System.out.println(id.split("-"));
        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
        String[] result = id.split("-");
        for (String num:result) {
            System.out.println(num);
        }
    }
}

