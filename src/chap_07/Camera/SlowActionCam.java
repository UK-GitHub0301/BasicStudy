package chap_07.Camera;

public class SlowActionCam extends ActionCam{
    public SlowActionCam() {
        this.name ="슬로우 액션 카메라";//해당 값은 Action에서 객체를 가지고 올 수 없다 왜냐면 Action에서 변수 접근자 앞에
        // private로 설정하여 ActionCam의 상위인 Camerad에서 호출자를 가지고 옵니다.
    }

    public void makeVideo() {
        System.out.println(this.name + " : "
                + this.lens + "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 제작합니다.");
    }
}
