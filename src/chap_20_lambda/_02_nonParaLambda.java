package chap_20_lambda;

import chap_20_lambda.clazz.Add;

public class _02_nonParaLambda {
    public static void main(String[] args) {
        //매개변수가 없는 람다식 만들기
        action (()-> {
            System.out.println(3 + 4);
            System.out.println(5 + 6);
        });

    }

    public static void action(Add add){
        add.add();
    }
}
