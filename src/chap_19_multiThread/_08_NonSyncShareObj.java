package chap_19_multiThread;

import chap_19_multiThread.clazz.NonSyncThread1;
import chap_19_multiThread.clazz.NonSyncThread2;
import chap_19_multiThread.clazz.PrintNumWithoutSync;

public class _08_NonSyncShareObj {
    public static void main(String[] args) {

        PrintNumWithoutSync pns = new PrintNumWithoutSync();
        NonSyncThread1 nst1 = new NonSyncThread1();
        NonSyncThread2 nst2 = new NonSyncThread2();

        //같은 객체를 공유해서 사용할 수 있도록
        nst1.setPns(pns);
        nst2.setPns(pns);

        //동기화 되지 않은 객체의 변수는 첫 스레드가 선점해도
        //두번재 스레드에서 값을 변경할 수 있어서
        // 개발자가 의도한 결과 값과 다른 값이 나올 수 있는 문제가 발생
        nst1.getPns().setNum(10);
        nst2.getPns().setNum(20);

        nst1.start();
        nst2.start();
    }
}
