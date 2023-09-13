package chap_02;

//키가 120cm 이상인 경우에만 탑승 가능
//삼항 연산자 이용
public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 121;

        String result = (120 < height) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }

}
