package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;

    int serialNumber;
    static String result() {
        int a = 1;
        return Integer.toString(a);
    }

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0으로 시작해서 ++ 연산을 통해서 값이 증가)

    static boolean canAutoReport = false; //자동 신고 기능


    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다.");
//        System.out.println("시리얼 넘버 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this();// 기본 생성자 호출: 위에 있는 BlackBox에 있는 내용을 호출
//
//        System.out.println("사용자 정의 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동으로 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 : " + capacity + " GB 입니다.");
    }

    int getVedioeFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        } else {
            return 10;
        }
    }


    // showDatatime : 날짜 정보 표시여부
    // showSpeed : 속도 정보 표시여부
    // min : 영상 기록 단위(분)
    void recored(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시 됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void recored() {
        System.out.println("영상에 날짜정보가 표시됩니다.");
        System.out.println("영상에 속도정보가 표시 됩니다.");
        System.out.println("영상은 5 분 단위로 기록됩니다.");

    }
//    void recored() {
//        recored(true, true, 5);
//
//    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)으로 연결합니다.");

    }

    //변수가 같은 경우 class
    void appedModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    // Getter : 값을 가지고 오는 메소드
    // Setter : 값을 설저하는 메소드
    //------------------------------------------------------------------------------------------//
    String getModelName() { // 모델명을 가져오는 메쏘드

        return modelName;
    }
    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    void setModelName(String modelName) {//String modelName에서 전달 받은 변수를 정의해준다.

        this.modelName = modelName;
    }

    //------------------------------------------------------------------------------------------//
    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {// 만일 resolution에 값이 null 또는 비어있는 경우
            // but boolean의 false와 개념은 다른 이야기 임
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    // 현재 모델 객체의 resolution(해상도)를 지정하지 않아,Getter와 Setter를 통해 resolution 생성자를 만들어 가져 옵니다.
    void setResolution(
            String resolution) {
        this.resolution = resolution;
    }


    //** 가격을 지정 하는데 _09_Getter&Setter 부분에서 -5000원이라는 부분을 수정 하는 내용입니다.//
    int getPrice() {
        return price;
    }

    void setPrice(int price) {// 현재 코드는 price를 설정 할때 최소 금액을 설정해주는 코드입니다.
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }

    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
