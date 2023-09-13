package chap_13;

import java.io.File;
import java.io.IOException;

//파일 만들기
public class _03_File {
    public static void main(String[] args) {

        String fileName = "test01.txt";
        File file = new File(fileName);
        try {
            file.createNewFile();
            if (file.exists()) {
                System.out.println("파일 생성이 완료 되었습니다.");
                System.out.println("파일 이름 : " + file.getName());
                System.out.println("파일 위치 : " + file.getAbsolutePath());
                System.out.println("파일 크기 : " + file.length());
            } else {
                System.out.println("파일 생성에 문제가 발생 하였습니다.");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        String fileName = "C:\\Users\\박상욱\\Desktop\\JavaWorkspace\\src\\chap_01\\text.txt";
//        File file = new File(fileName);
//        try {
//            file.createNewFile();
//            if (file.exists()) {
//                System.out.println("파일 이름 : " + file.getName());
//                System.out.println("파이 경로 : " + file.getAbsolutePath());
//                System.out.println("파일 크기 : " + file.length());
//            }
//        } catch (IOException e) {
//
//            throw new RuntimeException(e);
//        }


//        String fileName = "test.txt";
//        File file = new File(fileName);
//        try {
//            file.createNewFile(); // 파일 생성
//            if (file.exists()) {
//                System.out.println("파일 이름 : " + file.getName());
//                System.out.println("파일 위치 : " + file.getAbsolutePath());
//                System.out.println("파일 크기(byte) : " + file.length());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("프로그램 종료");
    }
}
