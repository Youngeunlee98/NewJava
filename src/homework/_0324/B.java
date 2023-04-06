package homework._0324;

import java.util.Calendar;

public class B {
    /*
    Calendar 객체를 오늘날짜로 생성하세요.

1. 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.

2. 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤로 변경하고 출력하세요.

---------------------------------------------------------------------------

Calendar 객체를 오늘날짜로 생성하세요.

1. 오늘날짜를 2023-03-24 형식으로 출력하세요.

2. 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
     */

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다."); //오늘 날짜

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020,4,8);

        System.out.println(cal2.get(Calendar.YEAR) + " / " + cal2.get(Calendar.MONTH) +" / " + cal2.get(Calendar.DATE));

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2020,4,3);

        //3일 뒤
        cal3.add(Calendar.DATE,3);
        System.out.println( "3일 뒤 : " +
                cal3.get(Calendar.YEAR) + "년 " +
                (cal3.get(Calendar.MONTH)+1) + "월 " +
                cal3.get(Calendar.DAY_OF_WEEK) + "일. ");


        //2달뒤
        cal3.add(Calendar.MONTH,2);
        System.out.println( "2달 뒤 : " +
                cal3.get(Calendar.YEAR) + "년 " +
                        (cal3.get(Calendar.MONTH)+1) + "월 " +
                        cal3.get(Calendar.DAY_OF_WEEK) + "일. ");


        //5년뒤
        cal3.add(Calendar.YEAR,5);
        System.out.println("5년 뒤 : " +
                cal3.get(Calendar.YEAR) + "년 " +
                        (cal3.get(Calendar.MONTH)+1) + "월 " +
                        cal3.get(Calendar.DAY_OF_WEEK) + "일. ");




    }
}
