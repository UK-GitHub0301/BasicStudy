package chap_04;

import static javax.print.attribute.standard.MediaSizeName.A;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch case
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        //Else if 문을 이용(여러 조건 또는 범위에 해당하는 조건에서 사용)
        int ranking = 1; // 등수
        if (ranking == 1)
        {
            System.out.println("전액 장학금");
        }
        else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("장학금 지급 완료 #1");

        System.out.println();
        System.out.println("-----------------");

        //Switch Case 문을 이용(명확안 케이스 기준이 있는 경우에 사용 )
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;

        }
        System.out.println("장학금 지급 완료 #2");


        //Switch Case 문을 이용
        //Case 통합
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;
        }
        System.out.println("장학금 지급 완료 #2");


        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하
        int grade = 3;// 등급
        int price = 7000; /// 기본 가격
        switch (grade) {
            case 1:
                price += 1000;

            case 2:
                price += 1000;

            case 3:
                price += 1000;

                break;
        }
        System.out.println(grade + " 등급 제품의 가격 : " + price + "원");
    }
}
