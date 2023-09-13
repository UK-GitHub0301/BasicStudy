package chap_07.Camera;

public class ActionCam extends Camera {
    public final String lens; // = "광각렌즈";

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public void makeVideo() {
        System.out.println(this.name + " : " + this.lens + " 멋진 비디오를 제작합니다.");
    }

}
