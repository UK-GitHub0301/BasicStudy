package chap_06;

public class _08_MainMethod {


    public static void main(String[] args) {
        // main Method : 자바코드가 실행시 제일 처음 실핼 되는 코드 부분
        for (String s : args) {
            System.out.println(s);

        }
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if(args.length==1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
            }
        }
    }
}
