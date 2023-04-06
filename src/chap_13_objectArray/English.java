package chap_13_objectArray;

import chap_13_objectArray.clazz.subjectCntTime;

public class English extends subjectCntTime implements ILecture{


    public English(String subject,
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





    /*@Override
    public void proceedLecture() {
        System.out.println("영어 수업을 30 명의 학생들이 듣습니다. 수업시간은 총 60분입니다.");

    }

     */
}
