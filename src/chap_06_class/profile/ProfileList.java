package chap_06_class.profile;

public class ProfileList {
    //이름 String
    //나이 int
    //사는 지역 String
    //직장 유무 String
    //성별 String

    public String guestName;
    public int age;
    public String region;
    public String office;
    public String gender;
    public int marry;

    public void profileInfo(){

        System.out.println("이름: " + guestName);
        System.out.println("나이: " + age);
        System.out.println("사는 지역: " + region);
        System.out.println("직장 유무: " + office);
        System.out.println("성별: " + gender);
        System.out.println("결혼 이력: " + marry);

    }

    public void characteristic(){
        System.out.println(guestName + "님은 " + (marry + 1) + "번째 결혼입니다.");
    }




}
