package chap_19_multiThread;

import chap_19_multiThread.clazz.AutoSaveThread;

public class _14_daemonThread {
    public static void main(String[] args) {
        AutoSaveThread ast = new AutoSaveThread();
        //데몬스레드로 만들기 -> 스레드객체.setDaemon(true);
        ast.setDaemon(true);
        //설정완료
        //시작
        ast.start();

        try {
            Thread.sleep(10000);
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        //10초뒤에 메인도 종료됨
        System.out.println("메인 스레드 종료됨.");
        System.out.println("데몬 스레드인 AutoSaveThread도 " + "자동으로 종료됩니다.");


    }
}
