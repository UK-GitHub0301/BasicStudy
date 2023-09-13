package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final 이란??
        // 어떤 변수를 Final로 선언을 하게 되면 선언과 동시에 Final 변수에 대한 값이 고정이 되며
        // 그 값을 사용할수 있지만 변경은 불가합니다.
        // 즉 어떠한 어미 클래스를 통하여 오버라이딩 되는 것이 싫을때 바꾸지 않았으면 할때 사용 하면 됩니다.

        ActionCam actionCam = new ActionCam();
//        actionCam.lens="표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("------------------------------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();



        // public (final) class ..
        // public (final) void...
        // public > abstract > static > final > ...


    }
}
