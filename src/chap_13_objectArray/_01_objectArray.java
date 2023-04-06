package chap_13_objectArray;

public class _01_objectArray {
    public static void main(String[] args) {
        //객체배열의 선언
        Lecture[] lecArr = new Lecture[3];

        //객체배열의 초기화
        lecArr[0] = new Lecture("자바", 30, 50);
        lecArr[1] = new Lecture("c언어", 29, 45);
        lecArr[2] = new Lecture("파이썬", 45, 60);

        //객체배열의 사용
        for (int i = 0; i < lecArr.length; i++) {
            lecArr[i].proceedLecture();
        }

        //다른 내용의 객체를 만들어서 넣을 수 있다.




    }
}
