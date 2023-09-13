package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.autoReport();//지원안됨
        BlackBox.canAutoReport = true; // 기능 개발(boolean 값 변경
        b1.autoReport();//지원 됨

        b1.insertMemoryCard(128);

        // 일반 영상 : 1(type)
        // 이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVedioeFileCount(1);
        System.out.println("일반 파일 영상 수 : " + fileCount + " 개");

        fileCount = b1.getVedioeFileCount(2);
        System.out.println("이벤트 파일 영상 수 : " + fileCount + " 개");

        fileCount = b1.getVedioeFileCount(0);
        System.out.println("총 영상 파일 수 : " + fileCount + " 개");

//        BlackBox b1 = new BlackBox();
//        b1.modelName = "까망이";
//
//        System.out.println("-------------------");
//        b1.autoReport();//지원 안됨
//        System.out.println("-------------------");
//        BlackBox.canAutoReport = true;
//        b1.autoReport();//지원 됩
//
//        b1.insertMemoryCard(256);
//
//        // 일반 영상 : 1
//        // 이벤트 영상(충돌 감지) : 2
//        int fileCount = b1.getVedioeFileCount(1);
//        System.out.println("일반 영상 파일 수 : " + fileCount + " 개");
//        fileCount = b1.getVedioeFileCount(2);
//        System.out.println("이벤트 영상 파일 수 : " + fileCount + " 개");


    }
}
