package chap_12;

import chap_12.clean.Room;
//FOR문을 활용해서 BOOLEAN으로 파일 이동하는거 연습해보기...
//FILE INPUT STREAM AND FILE OUTPUT STREAM..
//TXT 파일이 내요 적기..

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("---직원1 청소 시작---");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");
                    //###case###1//
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //###case###2//
//                    try {
//                        Thread.sleep(1000);
//                        if (i == 2) {
//                            throw new RuntimeException("집에 갈래!!!!ㅌㅌㅌㅌ");
//                        }
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    } finally {
//                        System.out.println("-- 직원1 청소 끝 --");
//                    }
                }
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("---직원2 청소 시작---");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        cleanerThread1.start();
        cleanerThread2.start();
    }
}
