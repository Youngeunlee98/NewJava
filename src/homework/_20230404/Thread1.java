package homework._20230404;

public class Thread1 extends Thread {
    private NumberPrinter np;

    public Thread1(NumberPrinter np) {
        this.np = np;
    }

    @Override
    public void run() {
        np.numPrint1(); //numPrint1 호출
    }
}

