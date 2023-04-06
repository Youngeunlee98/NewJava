package chap_06_class;

import chap_06_class.calc.Add;
import chap_06_class.calc.Minus;

public class _02_overriding {
    public static void main(String[] args) {


        Calcc cal = new Calcc();
        Add add = new Add();
        Minus min = new Minus();

        System.out.println(cal.add(4,3));
        System.out.println(cal.minus(4,3));

        System.out.println("-----------------");

        System.out.println(add.add(4,3));
        System.out.println(min.Minus(4,3));

    }
}
