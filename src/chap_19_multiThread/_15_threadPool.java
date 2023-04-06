package chap_19_multiThread;

import chap_19_multiThread.clazz.SumThread1;
import chap_19_multiThread.clazz.SumThread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _15_threadPool {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //스레드 풀 생성
        ExecutorService es =
                Executors.newFixedThreadPool(5);

        es.execute(new SumThread1()); // 1~10
        es.execute(new SumThread2()); // 30~50

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            if (i == 3){
                break;
            } // 메인돌면서 10 이되는 순간 셧다운되도록
        }
        //shutdownNow 는 interrupted() 호출로직포함, 진행중인 스레드들이 일시정지
        //interrupteException발생-> 강제종료

        //메인스레드가 종료되도 큐에 남아있는 작업들을 모두 처리하고
        //스레드풀 종료
        es.shutdownNow();
    }

}
