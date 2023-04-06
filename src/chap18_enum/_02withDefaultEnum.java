package chap18_enum;

import chap18_enum.eunms.DefaultMonth;

public class _02withDefaultEnum {
    //DefaultMonth.JAN;을 값으로 받는 DefaultMonth의 열거형 객체가 생성.
    public static void main(String[] args) {
        DefaultMonth jan = DefaultMonth.JAN;

        //DefaultMonth의 열거형 객체의 이름 (해당 상수의 이름)
        //=> JAN
        System.out.println(jan);
        //=>해당상수의 인덱스
        System.out.println(jan.ordinal());
        //=> DefaultMonth 열거형객체의 이름
        System.out.println(DefaultMonth.AUG);



    }
}
