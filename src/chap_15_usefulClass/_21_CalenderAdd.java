package chap_15_usefulClass;

import java.util.Calendar;

public class _21_CalenderAdd {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(2019, 4, 17);

        //7일 후
        cal.add(Calendar.DATE,7);
        System.out.println(
                cal.get(Calendar.YEAR) + "년 " +
                (cal.get(Calendar.MONTH)+1) + "월 " +
                cal.get(Calendar.DAY_OF_WEEK) + "일. ");


        //5년후
        cal.add(Calendar. YEAR,5);
        System.out.println(
                cal.get(Calendar.YEAR) + "년 " +
                        (cal.get(Calendar.MONTH)+1) + "월 " +
                        cal.get(Calendar.DAY_OF_WEEK) + "일. ");

        //31일 후
        cal.add(Calendar.DATE,31);
        System.out.println(
                cal.get(Calendar.YEAR) + "년 " +
                        (cal.get(Calendar.MONTH)+1) + "월 " +
                        cal.get(Calendar.DAY_OF_WEEK) + "일. ");

        //roll: 다른 단위의 변화는 무시하고 지정한 단위에서 연산
        cal.roll(Calendar.DATE,31);
        System.out.println(
                cal.get(Calendar.YEAR) + "년 " +
                        (cal.get(Calendar.MONTH)+1) + "월 " +
                        cal.get(Calendar.DAY_OF_WEEK) + "일. ");


    }
}
