
package chap_06_class;

import chap_06_class.calc.Add;
import chap_06_class.calc.Divibe;
import chap_06_class.calc.Minus;
import chap_06_class.calc.Multiple;

public class _01_instance {
    public static void main(String[] args) {
        //객체화 (인스턴스화)

        Add add = new Add();

        add.setNum1(10);
        add.setNum2(20);
        //add.setResult(add.getNum1() + add.getNum2());
        System.out.println(add.add());

        Minus min = new Minus();
        Multiple multi = new Multiple();
        Divibe divi = new Divibe();

        min.setNum1(10);
        min.setNum2(20);
        multi.setNum1(10);
        multi.setNum2(20);
        divi.setNum1(10);
        divi.setNum2(20);

        System.out.println(min.Minus());
        System.out.println(divi.Divibe());
        System.out.println(multi.multi());

        //설계도를 만드는 작업 == 인스턴스화, 객체화
        //항상 new키워드 함께 사용

        Calcc cal = new Calcc();

        int receiveNum = cal.add(10, 20);
        //리턴 값을 받아주는 매개변수가 없으면 결과가 메모리에 저장 X

        cal.add(10, 20);
        System.out.println(cal.add(10,20));
        System.out.println(cal.minus(cal.add(10,20), cal.divi(10,20)));

        Calcc cal2 = new Add();
        System.out.println(cal2.add(4, 3));

        Calcc cal3 = new Minus();
        System.out.println(cal3.minus(4, 3));

    }
}
