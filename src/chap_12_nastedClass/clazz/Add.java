package chap_12_nastedClass.clazz;

public class Add implements Calc{
    @Override
    public void calculator(int a, int b) {
        // TODO Auto-generated method stub
        Calc calc = new Calc() {

            @Override
            public void calculator(int a, int b) {
                // TODO Auto-generated method stub
                System.out.println("결과는 " + (a + b));

            }
        };

        calc.calculator(10, 20);

    }


}
