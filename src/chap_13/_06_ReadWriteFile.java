package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에서 내용을 작성할 때

        //파일 쓰기

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
//            bw.write("1. 이제 거의 끝이 보입니다.\\n");
//            bw.newLine();
//            bw.write("2. 여기까지 오신 여러분들 정말 대단해요.!");
//            bw.newLine();
//            bw.write("3. 조금만 더 열심히 합니다.");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //파일 읽기

        try (BufferedReader br = new BufferedReader((new FileReader("goodjob.txt")))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
