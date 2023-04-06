package chap_19_multiThread.clazz;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        //File f = new File();
        try {
            while (true) {
                System.out.println("스레드 실행됨");
                //Thread.interrupted()
                Thread.sleep(1);
            }
        } catch (InterruptedException ie) {
            //리소스 정리

            System.out.println(ie.getMessage());
            System.out.println("스레드 종료");
        } finally {
            //try~catch에 대한 후처리
        }

        /*
        while(true){
        sout("스레드 실핼");
        if(Thread.interrupted()){
        break;
        }
        }
        sout("리소스 정리");
        sout("스레드 종료");
         */


    }
}

