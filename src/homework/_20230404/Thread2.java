package homework._20230404;

public class Thread2 extends Thread {
    private NumberPrinter np;

    public Thread2(NumberPrinter np) {

        this.np = np;
    }

    @Override
    public void run() {

        np.numPrint2();
    }
}
