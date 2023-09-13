package chap_07;

import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

import java.awt.*;

public class _15_Super {
    public static void main(String[] args) {
        // super??
        // 부모의 클래스에서 사용하는 역활을 자식클래스에서 사용 하는 것을 말 합니다.
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("----------------");
        speedCam.takePicture();
    }
}
