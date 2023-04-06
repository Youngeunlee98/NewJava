package chap18_enum;

import chap18_enum.eunms.SubwayMap;

public class _08_useSubway {
    public static void main(String[] args) {
        SubwayMap sm = SubwayMap.Gangnam;
        System.out.println("이번 역은 "+ sm + ", " + sm + "역 입니다.");
        sm.subLine();

        SubwayMap sm1 = SubwayMap.Seoul;
        System.out.println("이번 역은 "+ sm1 + ", " + sm1 + "역 입니다.");
        sm1.subLine();

        SubwayMap[] subArr = SubwayMap.values();
        for (SubwayMap s : subArr){
                    s.subLine();
        }
        System.out.println("감사합니다.");



    }
}
