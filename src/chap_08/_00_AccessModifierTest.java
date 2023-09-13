package chap_08;

import chap_07.BlackBoxRefurbish; // 해당 코드는 chap_07이라는
// 패키지 안에 있는 BlackBoxRefurbish에 있는 내용을 가져와 쓰게 다고 선언한 코드 입니다.
// (따라서 코드에 대한 역 위치 추적도 가능 할 것으로 보여 집니다.)

// 만약 chap_07 패키지 안에 있는 모든 내용을가져와 사용 한다고 가정을 하는 경우네는
//"import charp_07.*" 로 해서 작성하면 됩니다.

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        // b1.resolution="FHD";// chap_07에서 default로 지정이 되어 다른 패키지에서 사용이 불가합니다.
        // b1.price = 200000; //private;
        //b1.color="블랙"; 같은 패키지이거나 자식 클래스인 겨우만 접근 가능.

    }
}
