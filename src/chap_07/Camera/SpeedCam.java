package chap_07.Camera;

//SpeedCam is a Camera.(IS-A)
public class SpeedCam extends Camera {//Camera의 자식 클래스: takePictue와 recordVideo의 메소드를 가져와서 사용한다.

    /*    public String name;
        public void takePicture(){
            // 사진 촬영
            System.out.println("사진을 촬영합니다.");
        }

        public void recordVideo(){
            // 동영상 촬영
            System.out.println("동영상 녹화를 촬영합니다.");
        }*/
// 위의 내용은 Camera라는 부모의 클래스를 따라 가기 때문에 자식 클래스에서 만들 필요가 없기 때문에 삭제 한다.
    public SpeedCam() {
//        this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture() {
        // 사진 촬영
//        System.out.println(this.name + " : 사진을 촬영합니다.");
        super.takePicture();
        checkSpeed();
        recognizedLicensePlate();
    }

    public void checkSpeed() {
        //속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizedLicensePlate() {
        // 번호 조회
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override //annotation :  주석
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 :  속도 측정, 번호 인식");
    }
}
