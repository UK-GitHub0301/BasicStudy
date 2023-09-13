package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        //제너릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("--------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("--------------------------");

        //int c3Name = (int) c3.name;
        Object c3Name = c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);
        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);
        // 위의 객체에 개발자가 원하는 값을바로 넣을 수가 없다. 이유는 CoffeeByName 같은 경우네 Object 타입으로 되어
        //형태를 한번 변경 타입 변수명 = (타입)변수명.인스턴스명
        // c4Name = (String) c3.name;

        System.out.println("--------------------------");

        Coffee c5 = new Coffee(34);
        c5.ready();
        int c5Name = (int) c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);
        System.out.println();

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);
        System.out.println();


        System.out.println("--------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser(("서장훈")));
        c8.ready();
        orderCoffee("김영철");
        orderCoffee(35);
        orderCoffee("알리샤", "에스프레소");
        orderCoffee(18, "에스프레소");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 커피 준비 완료 : " + name);
    }
}


