package chap18_enum;

import chap18_enum.eunms.Calculator;

public class _06_abstractMethodEnum {
    public static void main(String[] args) {

        Calculator add = Calculator.PLUS;
        int result = add.calculate(10, 5);
        System.out.println(result);

        Calculator minus = Calculator.MINUS;
        int result2 = minus.calculate(15,5);
        System.out.println(result2);

        //배열로 이용해서 계산하기
        Calculator[] cArr = Calculator.values();
        for(Calculator c : cArr){
            System.out.println(c.calculate(10,4)); //더하기,뻬기,곱하기,나누기 다해줌
        }



    }
}