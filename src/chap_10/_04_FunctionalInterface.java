package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(1);
        // convertUSD(USD -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1);
        Convertible convetible = USD -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convetible, 2);
        //전달값이 하나도 없다면?
        ConvertibleWidthNoParams c1 = () -> System.out.println("1달러는 1400원입니다");
        c1.convert();

        // 두 줄 이상의 코드가 있다면??
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        //전달값이 2개인 경우  ?

        ConvertibleWithTwoPrarams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우 ?
        ConvertibleWithReturn c3 = (d, w) -> d * w;
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);

    }
}
