package homework._0321;

public class Calculator {
    class Add{
        int a;
        int b;

        int result;
        int add(){
            result = a + b;
            return result;
        }

    }

    class Sub{
        int a;
        int b;

        int result2;
        int sub(){
            result2 = a - b;
            return result2;
        }

    }

    class Mul{
        int a;
        int b;

        int result3;
        int mul(){
            result3 = a * b;
            return result3;
        }

    }

    class Div{
        int a;
        int b;

        int result4;
        int div(){
            result4 = a / b;
            return result4;
        }

    }

        public static void main(String[] args) {
            Calculator c = new Calculator(); //외부 클래스 객체 생성

            Calculator.Add add = c.new Add();
            add.a = 10;
            add.b = 5;
            System.out.println(add.add());

            Calculator.Sub sub = c.new Sub();
            sub.a = 10;
            sub.b = 3;
            System.out.println(sub.sub());

            Calculator.Mul mul = c.new Mul();
            mul.a = 3;
            mul.b = 8;
            System.out.println(mul.mul());

           Calculator.Div div = c.new Div();
            div.a = 10;
            div.b = 2;
            System.out.println(div.div());

        }


    }
