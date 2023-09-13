package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _13_MethodOverriding {
    // overloading 과 overriding의 차이
    // overloading은 같은 클래스 내에서 똑같은 이름을 가진 메소드들을
    // 파타미터의 갯수나 타입을 다르게 함으로써 여러개를 정의합니다.

    //메소드 오버라이딩  : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰는 경우.
    // (기존의 정의된 부모클래스에서의 메소드 내용을 자식 클래스에서 내용을 변경 하는 내용을 말합니다.)
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }

}
