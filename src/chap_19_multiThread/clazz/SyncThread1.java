package chap_19_multiThread.clazz;

public class SyncThread1 extends Thread{
    private PrintNumWithSync pns;

    public void setPns(PrintNumWithSync pns) {
        this.pns = pns;
    }

    public PrintNumWithSync getPns() {
        return pns;
    }

    @Override
    public void run() {
        pns.printNum1(10);
    }
}
