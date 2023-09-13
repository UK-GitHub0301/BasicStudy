package chap_07.Camera;

//FactoryCam is a Camera.(IS-A)
public class FactoryCam extends Camera {//Camera의 자식 클래스: takePictue와 recordVideo의 메소드를 가져와서 사용한다.

    /*    public String name;

        public void takePicture(){
            // 사진 촬영
            System.out.println("사진을 촬영합니다.");
        }
        public void recordVideo(){
            System.out.println("동영상 녹화를 촬영합니다.");
        }*/
    // 위의 내용은 Camera라는 부모의 클래스를 따라 가기 때문에 자식 클래스에서 만들 필요가 없기 때문에 삭제 한다.
    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라");
    }
    public void recordVideo() {
        //동영상 녹화
//        System.out.println(this.name + " : 동영상 녹화를 촬영합니다.");
        super.recordVideo();
        detectFire();

    }

    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
