package chap_19_multiThread;

public class _03_threadMain {
    public static void main(String[] args) {
        Thread thread1 = Thread.currentThread();
        System.out.println(thread1.getName() + " 동작중");

        for (int i = 1; i < 3; i++) {
            Thread thread2 = new Thread(){
                public void run(){
                    System.out.println(getName() + " 동작중");
                }
            };
           thread2.start();
        }
        Thread thread3 = new Thread(){
            public void run(){
                System.out.println(getName() + " 동작중");
            }
        };

        thread3.setName("No3-Thread");
        thread3.start();


    }
}
