package chap_15_usefulClass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class _17_BigDecimal {
    public static void main(String[] args) {
        // BigDecimal 객체 생성
        BigDecimal bd1 = new BigDecimal(1.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.14);
        BigDecimal bd3 = new BigDecimal(12.111122222);


        //반올림 모드
        //divibe : 나눌때 오차가 발생 할 수 있으므로 반올림 모드 지정
        //MathContext(int precision) : precision은
        //연산에 사용할 총 자릿수, 정수의 자릿수도 포함
        System.out.println(bd2.divide(bd2, new MathContext(3, RoundingMode.CEILING)));
        //setScale 소수점 자리수 다시 설정
        System.out.println(bd2.setScale(5,RoundingMode.FLOOR));

        System.out.println(bd2.setScale(4,RoundingMode.UP));

        System.out.println(bd3.setScale(4,RoundingMode.DOWN));




    }
}
