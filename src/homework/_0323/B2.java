package homework._0323;

import javax.swing.plaf.basic.BasicScrollPaneUI;

public class B2 {
    /*
     2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
            비어있는 바이트의 공간을 a로 모두 채우시오.
     */

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(30); //크기 30 지정
        sb1.append("hello"); //문자열 담음

        //빈 바이트 공간 a로 채우기
        // append?
        //replace 활용

        int length = sb1.length();
        if (length < 30) {
            sb1.append("a".repeat(30 - length)); // 반복한다. 뭘? 길이30에서 문자열 길이만큼 뺀 길이동안 a넣는걸!
            String result = sb1.toString();
            System.out.println(result);
        }

    }
}
