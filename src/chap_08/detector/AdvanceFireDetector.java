package chap_08.detector;

public class AdvanceFireDetector implements Detectorable {
    @Override
    public void detect() {
        System.out.println("보다 개선된 성능으로 화재를 감지합니다.");
    }
}
