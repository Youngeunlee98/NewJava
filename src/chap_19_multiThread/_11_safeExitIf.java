package chap_19_multiThread;

import chap_19_multiThread.clazz.WhileThread;

public class _11_safeExitIf {
    public static void main(String[] args) {

        WhileThread wt = new WhileThread();

        wt.start();

        try {
            //메인 스레드를 1초동안 일시정지 시킨다.
            //while 스레드가 1초동안 반복실행 된다.
            Thread.sleep(1000);
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }

        wt.setStop(true);


    }
}
