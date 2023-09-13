package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스(Process)
        // 프로세스?
        // 일반적으로 cpu에 의해 메모리에 올려져 실행 중인 프로그램을 말하며, 자신만의
        // 메모리 공간을 포함한 독립적인 실행 환경을 가지고 있습니다. 우리가 사용하는 프로그램 중 일부는
        // 여러 프로세스간 상호작용을 하는 것일수도 있습니다.
        // 자바 JVM(Java Virtual Machine)은 주로 하나의 프로세스로 실해 되며, 동시에 여러 작업을 수행하기 위해서 멀
        // 티 쓰레드를 지원하고 있습니다.
        // 쓰레드
        // 프로세스안에서 실직적으로 작업을 실행하는 단위를 말하며, 자바에서는 JVM(Java Virtual Machine)에 의해 관리 됩니다.
        // 프로세스에는 적어도 한개 이상의 스레드가 있으며, Main 스레드 하나로 시작하여
        //스레드를 추가 생성하게 되면 멀티 스레드 환경이 됩니다.
        // 이러한 스레드들은 프로세스의 리소스를 공유하기 때문에 효율이긴 하지만 잠재적인 문제점을 노출 될 수도 있습니다.
        // *.run일 경우 하나의 프로세스가 완료 되고 나면 그 다음 작업이 완료 되는 메소드 기능이지만
        // 만일 동시에 처리를 한다면 run이 아닌 start을 써서 코드를 작성해야 횝니다.
        // ex : *.start.

        // 1 3 5 7 9
        // 2 4 6 8 10

        // cleanBySelf();
        CleanThread cleanThread = new CleanThread();
        cleanThread.start();
        cleanByBoss();
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + " 번 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + " 번 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}


