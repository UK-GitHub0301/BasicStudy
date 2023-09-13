package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속 : 부모라는 클래스에서 제공되는 곳을 자식클래스에서 다 사용한다.
        // 상속을 할 시에는 메소드 뒤에 extend + 부모클래스 이름 을 넣어 연결 합니다.
        // 상속 되는 부모 클래스는 하나만 될 수 있다. ","를 통하여 다중 으로 연결 할 수 없습니다.
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();// 화재감지 메소드를 가지고옵니다.
        speedCam.checkSpeed();// 속도 측정 메소드를 가지고 옵니다.
        speedCam.recognizedLicensePlate(); // 번호판 인식 메소드를 가지고 옵니다

    }
}
