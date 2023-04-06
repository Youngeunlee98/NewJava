package homework._0324;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class B2 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        //오늘 날짜 확인
        System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다."); //오늘 날짜

        Date today = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일 HH시 mm분 ss초");
        System.out.println(sdf1.format(today));




    }
}
