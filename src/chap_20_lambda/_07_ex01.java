package chap_20_lambda;

import chap_20_lambda.clazz.CompareStr;

public class _07_ex01 {
    public static void main(String[] args) {
        action(String :: equals);
    }

    public static void action(CompareStr cs){
        boolean result  = cs.compareTwoStr("bit","hit");

        if(result == true){
            System.out.println(result + ", 문자열이 같습니다.");
        }else {
            System.out.println(result +", 문자열이 다릅니다");
        }
    }
}
