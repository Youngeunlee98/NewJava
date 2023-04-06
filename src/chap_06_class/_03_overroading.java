package chap_06_class;

import chap_06_class.calc.Multiple;

public class _03_overroading {
    public static void main(String[] args) {

        Multiple mul = new Multiple();
        mul.setNum1(4);
        mul.setNum2(3);

        System.out.println("매개변수가 없는 multi()");
        System.out.println(mul.multi());
        System.out.println("매개변수가 한 개인 multi()");
        System.out.println(mul.multi(4));
        System.out.println("매개변수가 두 개인 multi()");
        System.out.println(mul.multi(4,3));


    }
}
