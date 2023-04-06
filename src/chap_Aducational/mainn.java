package chap_Aducational;

import chap_Aducational.learn.Eng;
import chap_Aducational.learn.Math;

public class mainn {
    public static void main(String[] args) {


        Eng eng = new Eng();


        eng.teacheng = "영어";
        eng.classCnt = 3;
        eng.studentCnt = 10;
        eng.teacherCnt = 6;
        eng.subjectCnt = 2;

        eng.adueng();
        eng.attend();
        eng.doHomwork();
        eng.teaching();
        eng.getRest();

        System.out.println("-------------------");

        Math math = new Math();

        math.teachMath = "수학";
        math.classCnt = 2;
        math.studentCnt = 15;
        math.teacherCnt = 5;
        math.subjectCnt = 1;

        math.adumath();
        math.attend();
        math.doHomwork();
        math.teaching();
        math.getRest();






    }
}
