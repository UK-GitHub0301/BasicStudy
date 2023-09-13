package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        //배열 선언 첫 번째 방법
        String[] coffees = new String[4];
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        // 배열 선언 두번째 방법
        // String coffees[] = new String[4];

        //세 번째 방법
        String[] coffees1 = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};

        //네 번째 방법
        String[] coffees2 = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        System.out.println();
        System.out.println("--------------------------------");

        //커피 주문
        System.out.println(coffees2[0] + " 하나"); // 아메리카노 하나
        System.out.println(coffees2[1] + " 하나"); // 카페모카 하나
        coffees2[2] = "에스프레소";
        System.out.println(coffees2[2] + " 하나"); // 라떼 하나
        System.out.println(coffees2[3] + " 하나"); // 카푸치노 하나
        System.out.println("주세요");

        //배열만들기
        String[] test = new String[4];
        test[0] = "test1";
        test[1] = "test2";
        test[2] = "test3";
        test[3] = "test4";
        String test1[] = new String[4];
        test1[0] = "test1";
        test1[1] = "test2";
        test1[2] = "test3";
        test1[3] = "test4";
        String[] test2 = new String[]{"test1", "test2", "test3"};

        String[] test3 = {"아메리카노", "카페모카", "라떼", "카푸치노"};

    }


}
