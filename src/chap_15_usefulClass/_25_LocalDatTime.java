package chap_15_usefulClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _25_LocalDatTime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023,3,24);
        LocalTime time = LocalTime.of(16,4,30);

        //of메소드를 이용한 LocalDateTime객체 생성
        LocalDateTime ldt1 = LocalDateTime.of(date,time);

        LocalDateTime ldt2 = date.atTime(time);
        LocalDateTime ldt3 = time.atDate(date);

        //현재날짜와시간의 LocalDateTime 객체 생성
        LocalDateTime ldt4 = LocalDateTime.now();

        //LocalDateTime -> 분리 방법
        LocalDate ld = ldt3.toLocalDate();
        LocalTime lt = ldt3.toLocalTime();

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt4);
        System.out.println(ld + ", " + lt);



    }
}
