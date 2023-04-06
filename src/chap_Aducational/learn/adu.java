package chap_Aducational.learn;

public abstract class adu {
    //반개수
    //학생수
    //선생수
    //과목수
    public int classCnt;
    public int studentCnt;
    public int teacherCnt;
    public int subjectCnt;

    //추상메소드
    //가르치다
    //숙제풀다
    //쉬다
    //출석

    public abstract void teaching ();

    public abstract void doHomwork();

    public abstract void getRest();

    public abstract void attend();



}
