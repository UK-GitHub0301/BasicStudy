package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러번 선언
        // 1. 전달 값의 타입이 다르거나
        // 2. 전달 값의 갯수가 다르거나
        // ** 만약에 반환값이 다르는 경우에는 오버로딩이 불가하다
        // JAVA에서는 같은 메소드로 생각 하지 않습니다.
        System.out.println(getPower(3)); // 3 * 3 = 9;
        System.out.println(getPower("4")); // 4 * 4 =16;
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 =27;
    }
}
