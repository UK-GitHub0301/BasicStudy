package chap_02;

public class _01_Operator {
    public static void main(String[] args) {
        // 산술 연산자

        //일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(4 % 2); // 0
        System.out.println(5 / 2); // 2 2.5라는 실수가 아님 2인 정수로 출력
        System.out.println(5 % 2); // 1
        System.out.println((double) 2 / 4); // 0 0.5라는 실수가 아닌 0인 정수로 출려

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        //증감 연산

        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 : ++는 1이라는 수를 증감하고 출력
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 : 10이라는 수가나오고 다음에 +1을 증감
        System.out.println(val); // 11

        //감소 연산
        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waitingNo = 0;
        System.out.println("대기 인원 : " + waitingNo++); // 0
        System.out.println("대기 인원 : " + waitingNo++); // 1
        System.out.println("대기 인원 : " + waitingNo++); // 2
        System.out.println("대기 인원 : " + waitingNo++); // 3
        System.out.println("총 대기 인원 : " + waitingNo + "명"); // 4명


        System.out.println();

    }
}
