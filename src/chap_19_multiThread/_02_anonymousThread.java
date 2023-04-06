package chap_19_multiThread;

public class _02_anonymousThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        for (int i = 1; i <5 ; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.start();// 스레드를 시작시키는 메소드.
        for (int i = 6; i < 10; i++) {
            System.out.println(i);
        }

    }
}
