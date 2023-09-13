package chap_08.Camera;

import chap_08.Camera.Camera;
import chap_08.detector.Detectorable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectorable, Reportable {
    private Detectorable detector;
    private Reportable reportor;

    public void setDetector(Detectorable detector) {
        this.detector = detector;
    }

    public void setReportor(Reportable reportor) {
        this.reportor = reportor;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reportor.report();
    }


    // 위의 코드는 Camera의 추상클래스인 showMainFeature라는 메소드를 받아서 기능 구현하는 것입니다.
}
