package chap_15_usefulClass;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _26_ZoneOffsetDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(); // 현재시간과날짜

        //ZoneId 객체 생성
        ZoneId zId = ZoneId.of("Asia/Seoul");
        //LocalDateTime에 ZoneId추가해서 ZonedDateTime 생성
        ZonedDateTime zdt = ldt.atZone(zId);
        ZonedDateTime zdt2 = ZonedDateTime.now();

        //ZonedDateTime객체에 ZoneId추가
        ZonedDateTime zdt3 = ZonedDateTime.now().withZoneSameInstant(zId);

        //ZoneDateTime - > offsetDateTime
        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println(zdt);
        System.out.println(zdt2);
        System.out.println(zdt3);
        System.out.println(odt);



















    }
}
