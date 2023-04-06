package chap_13_objectArray;

import chap_13_objectArray.clazz.subjectCntTime;

public class Mathmeticss extends subjectCntTime implements ILecture{

    public Mathmeticss(String subject,
                      int studentCnt, int lectureTime) {
        super(subject, studentCnt, lectureTime);
    }

    @Override
    public void proceedLecture() {
        // TODO Auto-generated method stub
        System.out.println(this.getSubject() +
                "수업을 " + this.getStudentCnt() +
                "명의 학생이 듣습니다. 수업시간은 " +
                this.getLectureTime() + "분입니다.");
    }

    /*
    public void proceedLecture() {

        System.out.println("수학 수업을 30 명의 학생들이 듣습니다. 수업시간은 총 60분입니다.");
    }

     */
}
