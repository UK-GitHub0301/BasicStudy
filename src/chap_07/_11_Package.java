package chap_07;
//탐색기 내에서 파일의 어디에 속해 있는지는 나타는 부분이다.(intelliJ같은 경우 사용자에게 쉽게 사용 하도록 자동
//셋팅이 되어 있지만, 타 프로그램에서는 유심히 봐야 되는 부분도 있다.그래서 만약에 eclips나 vscode or notepad에서 사용하게 되면
// package 따른 위치도 만들어 주어야 한다.

import java.io.FilterOutputStream;
import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("램던 정수 : " + random.nextInt());// int의 범위 내에서 정수형 값 변환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10));//0~10미만의 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble());//0~1까지 내의 실수형 값을 반환
        //System.out.println("랜덤 실수 (번위) : "+ random.nextDouble(10,0 )); nextduble에는 실수의 범위는 지정 할수 겂디 매눙에

        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));
        System.out.println("랜덤 boolean : " + random.nextBoolean());

        System.out.println("로또 번호(1~45이하) : " + (random.nextInt(45) + 1));
        // nextInt(45) : 0이상 45미만의 수
        // nextInt(45) + 1 : 1 이상 46미만의 수 =1<x<46
    }
}
