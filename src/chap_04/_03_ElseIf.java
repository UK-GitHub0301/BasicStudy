package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 + 1
        // 또는 망고 쥬스가 있으면 +1
        // 또는 아이스 아메리카노 +1
        boolean hanllabongAde = true;
        boolean mangoJuice = true;
        if (hanllabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 쥬스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료수 주문 완료 #1");

        System.out.println();
        System.out.println("----------------------------");
        //Else if 는 여러번 사용 가능

        hanllabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;
        if (hanllabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 쥬스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 쥬스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료수 주문 완료 #3");


        System.out.println();
        System.out.println("----------------------------");
        //else는 없어도 가능

        hanllabongAde = false;
        mangoJuice = false;
        orangeJuice = false;
        if (hanllabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 쥬스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 쥬스 +1");
        }
        System.out.println("음료수 주문 완료 #3");
    }
}
