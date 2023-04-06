package chap_20_lambda;

import chap_20_lambda.clazz.Academy;
import chap_20_lambda.clazz.ComAcademy;
import chap_20_lambda.clazz.EngAcademy;

public class _08_referConstructor {
    public static void main(String[] args) {
        comLectInfo((str, num)->
            new Academy(str, num));  //똑같음 -> comLectInfo(Academy::new);

        EngLectInfo(Academy::new);
        //EngLectInfo((str) -> new Academy(str));


    }

    public static void comLectInfo(ComAcademy ca){
        Academy ac = ca.getComAcademy("컴퓨터",50);
        ac.setLecTime(10);
         ac.lectureInfo();
    }

    public static void EngLectInfo(EngAcademy ec){
        Academy ac = ec.getEngAcademy("영어");
        ac.lectureInfo();
    }
}
