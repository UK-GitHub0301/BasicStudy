package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오후 3시


        //if 문 내에서 하나의 문장을 실행 때는 { } 생략 가능
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");

        //if 문 내에서 2개의 이상 문장을 실행 때는 { } 생략 불가
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        System.out.println("-----------------------");

        //Case#2 : 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = true; //모닝 커피
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        } else if (hour < 14 || morningCoffee) {
            System.out.println("아이스 디아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        System.out.println("-----------------------");
        System.out.println();

        //Case#3 : 오후 2이거나 모닝커피를 마신 경우?
        hour = 10;
        morningCoffee=true;
        //if (hour >= 14 || morningCoffee == true) {
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 디아메리카노 +1");
        }
        System.out.println("커피 주문 완료");
    }
}
