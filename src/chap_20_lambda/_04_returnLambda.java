package chap_20_lambda;

import chap_20_lambda.clazz.CustomString;
import chap_20_lambda.clazz.CustomString2;

public class _04_returnLambda {
    public static void main(String[] args) {
        action((a,b)->{
            String returnStr = b.concat(a);
            return returnStr;
        });

        action2((a, b,c) -> {
            String newStr = a + b;
            return newStr.indexOf(c);
        });

        //중괄호가 없을 대는 return 구문 사용 불가.
        action2((a,b,c) -> a.concat(b).indexOf(c));

    }

    public static void action(CustomString cs){
        String resultStr = cs.myConcat("bit", "naver");
        System.out.println(resultStr);

    }

    public static void action2(CustomString2 cs2){
        int index = cs2.indexOf("google", "microsoft", 'f');

        System.out.println(index);
    }
}
