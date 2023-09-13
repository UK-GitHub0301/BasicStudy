package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화(Data Abstraction)
        // 굳이 필요 없는 정보는 숨기고 꼭 필요한 정보만 또는 개발자가 원하는 정보만 오픈하도록 하는 클래스 입니다.
        // abstract
        // 추상 클래스(아직 완성 되지 않은 클래스??) 그래서 객체로 만들수 없다.
        // 그래서 이 클래스를 상속해야만 객체로 만들수 있다.
        // 추상 메소드(추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera(); : Camera라는 클래스는 abstract라는 추상 클래스 이기때문에
        // 객체를 만들수 없지만
        // 자식 클래스인 FactoryCam을 가지고는 만들 수 있습니다.

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }

}
