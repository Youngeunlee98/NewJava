package homework._20230404;

public class NumberPrinter {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void numPrint1() {
        for (int i = num; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }

    public void numPrint2() {
        for (int i = num; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}


