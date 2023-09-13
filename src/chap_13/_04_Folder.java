package chap_13;

import java.io.File;
import java.io.IOException;

public class _04_Folder {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\박상욱\\Desktop\\JavaWorkspace\\A\\B\\C\\test01.txt"; // 파일 생성 위치
        String folderName = "A"; //폴더 생성 위치
        File folder = new File(folderName); //
        File file = new File(fileName); //
        folder.mkdir();


//        if (folder.exists()) {
//            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        folderName = "A" + File.separator + "B" + File.separator + "C";
        folder = new File(folderName);
        folder.mkdirs();
        if (folder.exists()) {
            System.out.println("폴더 생성이 완료 되었습니다. : " + folder.getAbsolutePath());
            try {
                file.createNewFile();
                System.out.println("파일 생성이 완료 되었습니다.");
                System.out.println("파일 이름 : " + file.getName());
                System.out.println("파일 위치 : " + file.getAbsolutePath());
                System.out.println("파일 크기 : " + file.length());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("파일 생성이 완료 되었습니다.");
        } else {
            System.out.println("파일 생성에 문제가 생겼습니다. 확인 부탁 드립니다.");
        }


//        String folderName = "A";
//        File folder = new File(folderName);
//        folder.mkdir();
//        if (folder.exists()) {
//            System.out.println("폴더가 존재 합니다. : " + folder.getAbsolutePath());
//        }
//
//        System.out.println("------------------------------------------------------");
//
//        folderName = "A/B/C";
//
//        // "A" + File.separator + "B" + File.separator + "C"
//        // 윈도우 : C:\\Users\\Nadocoding\\Desktop
//        // 맥 :  User/Nadocoring/Desktop
//        //
//        folder = new File(folderName);
//        // foloder.mkdir() :
//        // folder.mkdirs() :
//        folder.mkdirs();
//        if (folder.exists()) {
//            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
//        } else{
//
//        }
    }
}
