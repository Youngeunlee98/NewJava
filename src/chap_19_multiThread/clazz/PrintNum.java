package chap_19_multiThread.clazz;

public class PrintNum {
    static int flag = 0;
    public static void printNum(int num){
        //Thread t1,t2
        //t1 = 1~num
        //t2 = num~num*2
        //join 메소드 사용 t2가 먼저 실행 되도록
        Thread main = Thread.currentThread();
        System.out.println(main.getName());

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for(int i = 1; i <= num; i++) {
                    if(flag > 0){
                        System.out.println(i);
                    }else {
                        Thread.yield();
                        i--;
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for(int i = num; i <= num * 2; i++) {
                    System.out.println(i);
                }
                flag = 1;
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            System.out.println("메인 스레드 일시 정지");
            t2.join();
            System.out.println("t1 스레드 일시 정지");
        } catch(InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}

