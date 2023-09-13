package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화(Encapsulation) : 필요한 것, 연관된 것들 만 하나의 캡슐에 담는 다는 의미
        // 예를 들어 블랙 박스 경우 서로 관련 있는 변수 데이터만 담는 다는 의미입니다. 관련된 기능 메소드만 담는다.

        //정보은닉(Information hiding)
        //말그대로 정보를 숨기는 것입니다. 블랙박스의 가격을 접근 하는 것을 무분별하게 접근하여 값을 변경하는 것을 막기 위해
        //객체내의 메소드의 직접적으로 접근하는 것을 막고 개발자가 허용한 범위 내, 형태로만 접근 하는 것을 말합니다

        // 만일 접근 자를 public으로 만드는 경우에는 반드시 파일 명과 접근 제어자 명이 같아야 합니다.

        // 접근 제어자 : 단어가 표현하는데로 접근을 제어 하는 것입니다.
        // 예를 들어 카페에 글을 공개 할때, 전체 공개 또는 회원에게만 공개 또는 회원 중 일부 회원만 공개하는 경우
        // 그 글을 열람 할수 있는 권한을 제어 하는 부분인데 이 부분을 자바에서도 사용 가능 합니다.
        // private : 해당 클래스 내에서만 접근이 가능 합니다.
        // public : 모든 클래스에서 접근이 가능 합니다.(공개 오픈)
        // default : (아무것도 적지 않았을 때 적용) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키내에서는 접근 가능, 만약 다른 패키지 같은 경우 자식 클래스(상속)에서 접근 가능.


        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";


        b1.setPrice(-5000);
        System.out.println("행사 가격 : " + b1.getPrice() + " 원");


        System.out.println("해상도 : "+ b1.resolution);

        System.out.println("----------------------------------------------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish(); //b1이라는 객체가 아닌 새로운 b2 객로 진행
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : "+b2.getPrice()+" 원");
        System.out.println("해상도 : "+b2.getResolution());


    }
}
