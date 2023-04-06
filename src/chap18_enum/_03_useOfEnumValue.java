package chap18_enum;

import chap18_enum.eunms.ValueMonth;

public class _03_useOfEnumValue {
    public static void main(String[] args) {
        // enum의 객체를 만들어 줄때 생성자가 자동으로 호출
        // 호출한 상수값이 생성자의 매개변수로 들어가서 선언되어있는 변수에 대입

        ValueMonth mar = ValueMonth.MAR;
        System.out.println(mar.getMonthVal()); // 3

        //여러형태의 enum객체 생성
        ValueMonth jan = ValueMonth.JAN;
        ValueMonth feb = ValueMonth.valueOf("FEB");
        ValueMonth apr = Enum.valueOf(ValueMonth.class, "APR");
        //이런 경우 숫자로 출력은 아님.
        System.out.println(jan + ", " + feb + ", " + apr); // JAN, FEB, APR

        //enum객체 배열
        ValueMonth[] vmArr = ValueMonth.values(); // 배열의 형태로만듬
        for (ValueMonth v : vmArr){ // valueMonth 를 v 로 설정하고 배열을 돌리면서 하나하나씩 돌려 출력하기 위함.
            System.out.println(v.name() + "은 "+ v.ordinal() + "인덱스에 있습니다. ");
                        // .name() : 이름으로 가져와서 찍어준다
                        // .ordinal() : 이 상수가 몇번 인덱스에 있는지 알려준다.
        }


    }
}
