package chap_01;
// 버스 번호는 "1234", "상암08"과 같은 형태
// 남은 시간은 분 단위(예 : 3분, 5분)
// 남은 거리는 km 단위(예 : 1.5km, 0.8km)
public class _Quiz_01 {
    public static void main(String[] args) {
        String busNo="상암08";
        int min = 3;
        double distance = 1.2;
        System.out.println(busNo+" 번 버스");
        System.out.println("약 "+min+"분 후 도착");
        System.out.println("남은 거리 "+distance+"km");
    }
}
