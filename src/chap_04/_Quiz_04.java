package chap_04;
// 주차 요금은 시간당 4000원(일 최대 요금은 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인
//Example
//일반 차량 5시간 주차시 20000원
//경차 5시간 10000원
//장애인 차량 10시간 주차시 15000원

public class _Quiz_04 {
    public static void main(String[] args) {
        boolean disableCar = false;
        boolean smallCar = false;
        int time = 10;

        int fee = time * 4000;
        if (fee > 30000) {
            fee = 30000;
        }
        if (smallCar || disableCar) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "입니다.");


    }
}
