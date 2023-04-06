package chap_19_multiThread;

import chap_19_multiThread.clazz.PrintNum;

public class _07_joinMethodEx {
    public static void main(String[] args) {
        PrintNum pn = new PrintNum();
        pn.printNum(10);

        System.out.println("finish");

    }
}
