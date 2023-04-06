package chap_12_nastedClass;


import chap_12_nastedClass.clazz.NestedClass;

public class _02_instancePfNestedClass {
    public static void main(String[] args) {
        //외부 클래스의 객체 생성
        NestedClass nc = new NestedClass();

        //1. 인스턴스 클래스의 객체 생성
        NestedClass.Mul mul = nc.new Mul(); //멤버를 호출 할 때 . 찍고 호출하듯이

        //2. 정적 중첩 클래스의 객체 생성
        NestedClass.Div div = new NestedClass.Div(); //메모리에 올라가 있으니까 바로 사용 가능

        //3. 정적 중첩 클래스의 정적 멤버에 접근
        System.out.println(NestedClass.Div.result);

        //3-1. 정적 중첩 클래스의 일반 멤버에 접근
        System.out.println(div.getNum3());

        //4. 인스턴스 중첩 클래스의 객체 사용
        mul.setNum1(150);
        mul.setNum2(15);
        mul.setResult(mul.getNum1() * mul.getNum2());
        System.out.println(mul.getResult());

    }
}


/*import chap_12_nastedClass.clazz.NestedClass.Div;
import chap_12_nastedClass.clazz.NestedClass;
class Outer{
    public class  Mul{
        public int num1 = 10;
        public int num2 = 20;

        public int result = num1 * num2;
    }

    static public class Div{
        public int num1 = 10;
        public int num2 = 5;

        public int result = num1 / num2;


    }
}

public class _02_instancePfNestedClass {
    public static void main(String[] args) {
        Outer out = new Outer();


        // 중첩클래스의 객체 생성
        Outer.Mul mul = out.new Mul();
        NestedClass nc = new NestedClass();

        //중첩 클래스의 객체 생성은 외부클래스의 객체를 사용해서
        // 외부 클래스의 객체 .new 중첩클래스 생성자();

        NestedClass.Mul mul2 = nc.new Mul();
        System.out.println(mul2.result);

        //static
        NestedClass.Div div = new Div();
        System.out.println(div.result);




    }

}
*/