package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0(int -> float type)
        System.out.println((double) score); // 93.0(int -> double type)

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;

        System.out.println((int) score_f);// 93
        System.out.println((int) score_d); // 98

        //정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score); // 93 + 98 = 191

        score_d = /*(double)*/ 93 + 98.9;
        System.out.println(score_d); // 93 + 98.8 = 191.8

        //변수에 형 변환된 데이터 집어 넣기/
        double convertedScoreDouble = score; // 190 -> 191.0
        System.out.println(convertedScoreDouble);
        //int -> long -> float -> double (자동으로 변환이 이루어 진다.)

        int convertedScoreInt = (int) score_d; // 191.8-> 191
        //double -> float -> long -> int(수동으로 변환해줘야 한다.)

        // 숫자(정수)를 문자열로
        String s1 = String.valueOf(93); // 93이라는 정수를 문자인 93으로 변경 가능
        s1 = Integer.toString(93); // 93이라는 정수를 문자인 93으로 변경
        System.out.println(s1.getClass());

        // 숫자(실수)를 문자열로
        String s2 =String.valueOf(98.8); // 98.8이라는 실수를 문자인 98.8로 변환
        s2= Double.toString(98.8); //98.8이라는 실수를 문자인 98.8로 변환
        System.out.println(s2);

        //**String.valueof 와 Double.toString and Integer.toString의 차이
        //String.valueOf():
        //이 메서드는 모든 데이터 유형을 문자열로 변환할 수 있습니다.
        // 따라서 double, int, boolean 등 어떤 유형의 값을 문자열로 변환해도 작동합니다.
        //null 값이 매개변수로 전달되면, "null"이라는 문자열로 변환됩니다.
        //내부적으로 valueOf() 메서드는 Object.toString() 메서드를 호출하여 해당
        // 객체의 문자열 표현을 반환합니다.
        // 따라서 String.valueOf()를 Double 객체에 대해 호출하면 Double.toString()과 동일한 결과를 얻습니다.

        //Double.toString and Integer.toString():
        //이 메서드는 double, int 타입의 값을 문자열로 변환합니다.
        //null 값을 매개변수로 사용할 수 없습니다.
        //내부적으로 Double(Integer).toString() 메서드는 Double(Integer) 클래스의 정적 메서드이며,
        // double(int) 값을 문자열로 변환하여 반환합니다.

        //문자열을 숫자로
        int i =Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        int error = Integer.parseInt("자바");
        System.out.println(error);

    }
}
