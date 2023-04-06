package chap_12_nastedClass;

public class _01_innerStaticNestedClass {
    //내부 클래스 (인스턴스 클래스)
    class Add{
        int num1 = 100;
        //static변수는 static 클래스에서만 사용 가능
        //static int num2 = 200; -> 에러
        final static int num2 = 300; // -> 상수로 선언된 static은 가능

        int result = num1 + num2;


    }
        // 정적 중첩 클래스 선언
    static class Sub{
        static int num3 = 200;
        static int num4 = 100;

        static int result1 = num3 - num4;
    }

    public static void main(String[] args) {
        //중첩 클래스의 사용
        System.out.println(Sub.result1);

        //욉부 클래스의 객체를 만들지 않고 내부클래스의 캑체를 만들어내면 에러 발생
        //Add.add = new Add();
        System.out.println(Add.num2);








    }


}
