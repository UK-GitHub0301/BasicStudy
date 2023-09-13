package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        //class Person : 사람
        // class Student extend Person : 학생(학생은 사람이다. Student is a person.)
        // class Teacher extends Person : 선생님(선생님은 사람이다. Teracher is a person.)

        // 기존에 배운 학습 내용대로라면 각 클래스명으로 메소드를 객체를 불러 왔었지만
        // 아래 처럼 부모 클래스(Camera) 라는 클래스를 통하여 각 클래스에 있는 메소드를 가지고 올 수 있습니다.

//        Camera camera = new Camera();
//        FactoryCam factoryCam = new FactoryCam();
//        SpeedCam speedCam = new SpeedCam();
// 부모클래스의
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-----------------------------------------");
        //위의 내용을 이해해서 활용 한다면 객체를 배열로 관리를 할 수 있습니다.
        // 에를 들어
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();

        }
        System.out.println("-----------------------------------------");
        // 보모 클래스로 활용하는 메소드 외에 각 클래스에 있는 메소드를 실행을 할려고 하지만 되지 않습니다.
        // 이유는 위의 코드에서 FactocyCam 의 클래스와 SpeedCam에 있는 클래스를 부모 클래스명으로 동일을 하였기 때문에 사용 할 수
        // 이용이 불가 하게 되여였습니다.

        // factoryCam.detectFire();
        // speedCam.recognizedLicensePlate();
        // speedCam.checkSpeed();
        //위의 3개의 클래스메소드 코드 사용 불가.
        //자바에서는 어떤 클래스 인터스턴스인지 확인하는  인스턴스 키워드로 활용 합니다.

        if(camera instanceof Camera){//camera 객체가 Camera라는 클래스로부터 만들어진
            // Camera의 인스턴스라면 "카메라입니다"라는 것을 출력 할 수 있습니다.
            System.out.println("카메라입니다.");
        }

        if(factoryCam instanceof FactoryCam){
            ((FactoryCam) factoryCam).detectFire();
        }
        //factoryCam이라는 객체가 FactoryCam라는 클래스로부터 만들어진 FactoryCam의 인스턴스라면 FactoryCam으로 형 변환을 해서
        //화재 감지 메소드를 가지고 올 수 있습니다.ex: ((클래스이름) 클래스의 객체 이름).메소드 이름

        if(speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizedLicensePlate();
        }

        System.out.println("---------------------------------");
        factoryCam.showMainFeature();
    }
}
