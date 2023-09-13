package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        System.out.println("Type1");
        b1.recored(false, false, 10);

        System.out.println("Type2");
        b1.recored(true,true,5);

        System.out.println("Type3");
        b1.recored(false,true,3);

        System.out.println("Type4");
        b1.recored();

    }
}
