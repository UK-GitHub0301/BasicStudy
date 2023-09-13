package chap_07;

import java.sql.SQLOutput;
import java.util.Calendar;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형(enum) : 상수들의 묶음
        // 달력 : JAN, FEB, MARCH, APRIL ...
        // 옷 사이즈 : S, M, L, Xl
        // OS 종류 :  WIN10, WIN11, MACOS, LINUX, ...
        // 해상도 : HD, FHD, QHD, UHD, ...
        Calendar time = Calendar.getInstance();


        System.out.println(time.getTime());

        System.out.println(time.get(Calendar.DAY_OF_WEEK));
        System.out.println("----------------------------");
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println("-----------------");
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);
        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 품질 Information : ");
        switch (resolution) {
            case HD:
                System.out.println("현재 영상은" + Resolution.HD + "품질로 출력 되고 있습니다.");
                break;
            case FHD:
                System.out.println("현재 영상은" + Resolution.FHD + "품질로 출력 되고 있습니다.");
                break;
            case UHD:
                System.out.println("현재 영상은" + Resolution.UHD + "품질로 출력 되고 있습니다.");
                break;
            case QHD:
                System.out.println("현재 영상은" + Resolution.QHD + "품질로 출력 되고 있습니다.");
                break;
            default:
                System.out.println("영상 정보 표기가 되지 않고 있습니다. 확인 부탁 드립니다.");
        }
        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("-------------------------------");

        for (Resolution myRes : Resolution.values()
        ) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
            // Resolution name + : + Resolution index(Number)
            // 열거형(enum)인 Resolution의 순서를 알수 있는 메소드입니다.

        }

        for (Resolution myRes : Resolution.values()
        ) {
            System.out.println(myRes.ordinal() + "." + myRes.name() + " : " + myRes.getWidth());
        }

        // enum 같은 경우 (Class 명) (변수명)=(Class 명).(values)
//        Resolution resolution = Resolution.HD;// resolution이 Resolution Class내의 HD라는 값을 가지게 됩니다
//        System.out.println(resolution);
//        resolution = Resolution.FHD;
//        System.out.println(resolution); //resolution의 값이 Resolution Class내의 FHD의 값을 가지고 오게 됩니다.
//        System.out.println("------------------------------------");
//        System.out.println();
//        resolution = Resolution.UHD;
//        System.out.print("동영상 녹화 품질 : ");
//        switch (resolution) {
//            case HD:
//                System.out.println("현재 보여 지고 있는 화질은 " + Resolution.HD + " 품질입니다.");
//                break;
//            case FHD:
//                System.out.println("현재 보여 지고 있는 화질은 " + Resolution.FHD + " 품질입니다.");
//                break;
//            case UHD:
//                System.out.println("현재 보여 지고 있는 화질은 " + Resolution.UHD + " 품질입니다.");
//                break;
//            case QHD:
//                System.out.println("현재 보여 지고 있는 화질은 " + Resolution.QHD + " 품질입니다.");
//                break;
//        }
//        //enum을 활용하여 foreach를 하는 경우에는 values를 사용합니다.
//        for (Resolution myRes : Resolution.values()) {
//            System.out.println(myRes.name() + " : " + myRes.ordinal());
//        }
//
//        for (Resolution myRes : Resolution.values()) {
//            System.out.println(myRes.ordinal() + " : " + myRes.name() + " : " + myRes.getWidth());
//        }
//    }
//
//}
//
//enum Resolution {
//    HD(1280), FHD(1920), UHD(3840), QHD(5120);
//
//    private final int width;
//
//    Resolution(int width) {
//        this.width = width;
//    }
//
//    public int getWidth() {
//        return width;
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840), QHD(5120);

    public final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}// Resolution이라는 열거형(enum)에는 4개의 상수 HD, FHD, UHD, QHD