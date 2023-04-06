package chap_20_lambda;

import chap_20_lambda.clazz.UpperCaseInter;

public class _06_referParaMethod {
    public static void main(String[] args) {
        action(String :: toUpperCase );
    }

    public static void action(UpperCaseInter uci){
        String result = uci.allUpperCase("bit");
        System.out.println(result);
    }
}
