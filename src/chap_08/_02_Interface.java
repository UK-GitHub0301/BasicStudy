package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.detector.AdvanceFireDetector;
import chap_08.detector.Detectorable;
import chap_08.detector.FireDetector;
import chap_08.reporter.*;


public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 그냥 뼈대만 제공하는 Class
        // extends(단일 상속)
        // 만일 여러 클래스를 상속을 받아야 되는 경우에는 implement
        // 즉 interface를 활용하여 코드를 작성 하면 됩니다.

        Reportable nomalReporter = new NomalReporter();
        nomalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectorable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectorable advanceFireDetector = new AdvanceFireDetector();
        advanceFireDetector.detect();

        System.out.println("--------------------------------------");
        System.out.println("줄바꿈");

        FactoryCam factoryCam= new FactoryCam();
        factoryCam.setDetector(advanceFireDetector);
        factoryCam.setReportor(videoReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
