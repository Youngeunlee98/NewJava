package chap_19_multiThread.clazz;

public class SyncThread4 extends  Thread{
    private PrintNumWithWaitNotify pns;

    public void setPns(PrintNumWithWaitNotify pns) {
        this.pns = pns;
    }

    public PrintNumWithWaitNotify getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum2(20);
    }
}
