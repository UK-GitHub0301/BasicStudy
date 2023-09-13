package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형은 method를 가질 수 없지만, 참조 자료형은 method를 가질 수 있습니다.
        // 기본 자료형(Primitive Data Types) : int, float, double, long, boolean, ...

        int[] i = new int[3];
        System.out.println(i[0]);//0


        double[] d = new double[3];
        System.out.println(d[0]);// 0.0

        //참조 자료형 (Non-Primitive , Reference Data Typese) : String.. Class, Camera, FactoryCa, SpeedCam, ...
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);//true
        ///////////////////////////////////////////

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);
        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1"; //c1----->"카메라1"
        c2.name = "카메라2"; //c2----->"카메라2"
        System.out.println(c1.name);
        System.out.println(c2.name);
//        c2 = c1;
        //c1----->"카메라1"
        //c2---x-->"카메라1" >>> c2----->"카메라1"
        System.out.println(c1.name);//카메라1
        System.out.println(c2.name);// 카메라1
        c2.name="고장난 카메라";
        //replace 카메라1 to 고장난 카메라..
        // c1.name = 고장난 카메라;
        System.out.println(c1.name);
        System.out.println(c2.name);
//        changeName(c2);
        //replace 고장난 카메라 -----> 잘못된 카메라(아래의 있는 changeName의 메소드 값을 가져 옵니다.
//        System.out.println(c1.name);
//        System.out.println(c2.name);
//        c2.name=null;

        System.out.println(c2.name);

    }
    public static void changeName(Camera camera){
        camera.name="잘못된 카메라";
    }
}
