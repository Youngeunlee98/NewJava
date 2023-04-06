package chap_13_objectArray;

public class _02_objectArray2 {
    public static void main(String[] args) {

            // TODO Auto-generated method stub
            ILecture[] lecArr = new ILecture[3];

            lecArr[0] = new English("영문법", 30, 100);
            lecArr[1] = new Mathmeticss("미적분", 15, 120);
            lecArr[2] = new Programming("자바", 50, 90);

            for(int i = 0; i < lecArr.length; i++) {
                lecArr[i].proceedLecture();
            }
        }
    }

