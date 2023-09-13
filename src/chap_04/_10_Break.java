package chap_04;

import java.sql.SQLOutput;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 ( 1인당 1마리만 구매 가능 )

        //For 문
        int max = 20;
        for (int i = 1; i <= max; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다");
            if (i == max) {
                System.out.println("금일 재고가 떨어졌습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("--------------While문-------------");


        int customer = 1;
        while(customer<=50){
            System.out.println(customer+"번 손님, 주문하신 치킨 나왔습니다");
            if (customer==max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            customer++;

        }
        System.out.println("영업을 종료합니다.");
    }
}
