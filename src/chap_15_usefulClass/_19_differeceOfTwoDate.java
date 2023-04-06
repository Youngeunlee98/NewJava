package chap_15_usefulClass;

import java.util.Calendar;

public class _19_differeceOfTwoDate {
    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();

        d2.set(2011,2,11);

        //getTimeInMill () : 날짜와 시간을 밀리세컨드 단위로 가져옴

        //
        long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
        System.out.println("d2부터 d1까지 " + (diff / 1000) + "초가 지났습니다. ");
        System.out.println("d2부터 d1까지 " + (diff / (1000 * 60)) + "분이 지났습니다. ");
        System.out.println("d2부터 d1까지 " + (diff / (1000 * 60 * 60)) + "시간이 지났습니다. ");
        System.out.println("d2부터 d1까지 " + (diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다. ");
        System.out.println("d2부터 d1까지 " + (diff / ((long)1000 * 60 * 60 * 24 * 30)) + "달이 지났습니다. ");
        System.out.println("d2부터 d1까지 " + (diff / ((long)1000 * 60 * 60 * 24 * 30 * 12)) + "년이 지났습니다. ");

        System.out.println("년, " + "달, " + "일, " + "시간, " + "분, " + "초 지났습니다.");

        long year = diff / ((long)1000 * 60 * 60 * 24 * 30 * 12);
            diff = diff %
                    ((long)1000 * 60 * 60 * 24 * 30 * 12);
        long month = diff / ((long)1000 * 60 * 60 * 24 * 30);
            diff = diff %
                    ((long)1000 * 60 * 60 * 24 * 30);
        long day = diff / (1000 * 60 * 60 * 24);
            diff = diff %
                    (1000 * 60 * 60 * 24);
        long hour = diff / (1000 * 60 * 60);
            diff = diff %
                    (1000 * 60 * 60);
        long min = diff / (1000 * 60);
            diff = diff %
                    (1000 * 60);
        long sec = diff / 1000;



        System.out.println(year + "년, "+ month + "달, "+ day + "일, " + hour + "시간, " + min + "분, " + sec + "초 지났습니다.");



    }
}
