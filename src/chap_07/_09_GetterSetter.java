package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox(); //b1이라는 새로운 객체(Blackbox를 속성을 가진)
        b1.modelName = "까망이";
        //b1.resolution = "FHD"; <- 담당자의 실수로 해당 제품의 해상도에 대한 정보는 주석 또는 삭제 처리
        b1.price = 200000;
        b1.color = "블랙";

        //할인 행사를 하기 위해
        //b1.price = b1.price-5000; 으로 할 예정이지만 담당자의 실수로
        b1.price = -5000; // 가격전체를 -5000으로 변경, 즉 제품을 구매하면 -5000원을 더 주는 경우가 되어 버림.
        System.out.println("행사 가격 : " + b1.price + " 원");

        //상품에 질문이 들어 오는 경우(고객 문의)-해상도 문의
        System.out.println("해상도 : "+ b1.resolution);// null : 해상도에 대한 값이 없다고 나옴

        System.out.println("----------------------------------------------------------");

        BlackBox b2 = new BlackBox(); //b1이라는 객체가 아닌 새로운 b2 객체 진행
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : "+b2.getPrice()+" 원");
        System.out.println("해상도 : "+b2.getResolution());

        b2.price = -5000;
        // **이와 같이 getter와 setter를 이용하면은 클래스에서 개발자가 원하는 값이 들어 가지 않거나
        // 문제 되는 부분에 대해서 값을 설정하면서 발생하는 오류 또는
        // 값을 가져 오면서 발생 하는 오류, 또는 이상한값에 대한 대안으로 사용할 수 있습니다.
        // 참고로 b2.price = -5000;으로 해 버리면 앞에 했던 부분과 같아 지지만 final이라는
        // 코드는 반환값 앞에 넣어 주면 그 반환돠어 지는 값에 고정이 되므로 에러가 발생하지 않는다.
    }
}
