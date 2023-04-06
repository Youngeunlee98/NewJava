package chap_20_lambda;

import chap_20_lambda.clazz.MulandDiv;

public class _03_paraLambda {
    public static void main(String[] args) {
        //매개변수 0 람다식
        MulandDiv mad = new MulandDiv();

        mad.action1(a -> System.out.println(a*a)); // 10*10 = 100
        mad.action2((a,b) -> System.out.println(a/b)); // 10/5 = 2

        mad.action2((a,b) ->{
            System.out.println(a/b); //실행문 1 => 10/5=2
            System.out.println((a*a)/(b*b)); // 실행문 2 => 100/25 = 4
        });


    }
}
