package chap_09;

public class _01_Generic {
    public static void main(String[] args) {
        // 제네릭스
        // 다양 타입의 객체를 지원하는 클래스나 인터페이스를 또는 메소를 정의하는 방법
        // 똑같은 동작을 하는 클래스나 메소드를 한번만 정의하여 여러타입을 지원합니다.

        Integer[] iArray = {1, 2, 3, 4, 6};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};


        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-----------------");
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }


    //T : Type, K : Key, V : Value, E : Element <>
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t+ " "); //A B C D E
        }
        System.out.println();

    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " "); //A B C D E
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " "); //1.0 2.0 3.0 4.0 5.0
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); //1 2 3 4 5
        }
        System.out.println();
    }
}
