package chap_12_nastedClass;

import chap_12_nastedClass.clazz.Calc;

public class _05_anonymousClass {
    Calc calc = new Calc() {
        @Override
        public void calculator(int a, int b) {
            System.out.println("결과는 "+(a + b));
        }
    };

}

