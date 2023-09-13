package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 액티비티
    public static String getActivate() {
        return "볼링장,탁구장, 농구장";
    }


    public static void main(String[] args) {
        //반환값, Return
        String phoneNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + phoneNumber);
        String getAddress = getAddress();
        System.out.println("호텔 주소 : " + getAddress);
        String getActivate = getActivate();
        System.out.println("호텔 액티비는 : " + getActivate);
    }
}
