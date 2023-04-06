package chap18_enum;

import chap18_enum.eunms.Season;

public class _07_koreaSeasons {
    public static void main(String[] args) {
        Season spr = Season.SPRING;
        //메소드 가져와서 출력하는거 sout에서 못한다고. 제발 기억해라.
        spr.FourSeasons();

        Season sum = Season.SUMMER;
        sum.FourSeasons();

        Season f = Season.FALL;
        f.FourSeasons();

        Season win = Season.WINTER;
        win.FourSeasons();

        Season[] seasonArr = Season.values();
        for(Season s: seasonArr){
            s.FourSeasons();
        }

        //ava Enum 타입은 일정 개수의 상수 값을 정의하고, 그 외의 값은 허용하지 않는다.

    }


}
