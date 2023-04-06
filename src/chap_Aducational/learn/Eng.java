package chap_Aducational.learn;

public class Eng extends adu {

    public String teacheng;
    public  void  adueng(){
        System.out.println("이곳은 " +teacheng +"학원 입니다.");
    }

    @Override
    public void teaching() {
        System.out.println( teacherCnt + "명의 선생님들이 아이들을 가르치고 있습니다.");
    }

    @Override
    public void doHomwork() {
        System.out.println( studentCnt + "명의 아이들이 "  + subjectCnt + "개 과목의 숙제를 풀고 있습니다.");
    }

    @Override
    public void getRest() {
        System.out.println(teacherCnt + "명의 선생님들과 " + studentCnt + "명의 아이들이 쉬고 있습니다.");
    }

    @Override
    public void attend() {
        System.out.println(studentCnt + "의 아이들이 학원에 출석하였습니다.");
    }



}
