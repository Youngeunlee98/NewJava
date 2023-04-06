package chap_09_polymorphism;

import chap_09_polymorphism.product.Aircone;
import chap_09_polymorphism.product.Tv;

public class _01_methodOverriding {
    public static void main(String[] args) {
        //1. 다형성의 구현
        //부모형탱,; 변수에 자식 인스턴스를 담아 다양하게 사용.

        ElectronicDevice ed = new Tv();
        ed.powerOn();
        ed.operate();
        ed.powerOff();

        ed.powerOn();

        ed = new Aircone();
        ed.powerOn();
        ed.operate();
        ed.powerOff();
        ed.powerOn();


    }
}
