package chap_20_lambda;

import chap_20_lambda.clazz.Convertor;
import chap_20_lambda.clazz.MoneyConvertor;

public class _05_referenceMethod {
    public static void main(String[] args) {
        action((MoneyConvertor :: convertor ));

        //static이 아닌 경우 무조건 객체화 해서 사용하기
        MoneyConvertor mc = new MoneyConvertor();
        action(mc :: instanceConvert);

    }
    public static void action(Convertor con){
        int result = con.conv(1000000, '$');
        System.out.println("변환된 돈: $" + result);
    }
}
