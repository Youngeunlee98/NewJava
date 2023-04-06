package chap_06_class;

import chap_06_class.profile.ProfileList;

public class _08_marryCompany {
    public static void main(String[] args) {

        ProfileList guest = new ProfileList();
        ProfileList guest2 = new ProfileList();
        ProfileList guest3 = new ProfileList();
        ProfileList guest4 = new ProfileList();

        System.out.println("-----고객 정보-----");
        System.out.println();

        guest.guestName = "Jane";
        guest.age = 36;
        guest.region = "켈리포니아";
        guest.gender = "여자";
        guest.office = "승무원";
        guest.marry = 1;

        guest.profileInfo();
        guest.characteristic();

        System.out.println("--------------------");
        System.out.println();

        guest2.guestName = "원빈";
        guest2.age = 34;
        guest2.region = "서울";
        guest2.gender = "남자";
        guest2.office = "세무사";
        guest2.marry = 0;

        guest2.profileInfo();
        guest2.characteristic();

        System.out.println("--------------------");
        System.out.println();

        guest3.guestName = "장기용";
        guest3.age = 39;
        guest3.region = "남양주";
        guest3.gender = "남자";
        guest3.office = "교사";
        guest3.marry = 1;

        guest3.profileInfo();
        guest3.characteristic();

        System.out.println("--------------------");
        System.out.println();

        guest4.guestName = "전지현";
        guest4.age = 28;
        guest4.region = "서울";
        guest4.gender = "여자";
        guest4.office = "배우";
        guest4.marry = 0;

        guest4.profileInfo();
        guest4.characteristic();




        // 등록된 고객도 있고, 내가 새로 등록도 하고 -> scanner?
        //검색하면 나오고....?

    }
}
