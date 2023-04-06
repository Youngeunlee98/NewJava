package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and","," )); // and 를 ,로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작이되고 이전은 잘라내기가 됨.
        System.out.println(s.substring(s.indexOf("Java"))); //윗 문장과 똑같음.
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); //Java로부터 끝글자 직전까지의 문장을 나타냄 = 마지막인 . 없어짐

        //공백제거
        s = "      I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        //문자열 결합
        String s1= "Java";
        String s2= "Pathon";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));//concat은 문자열을 결합해줌.

    }
}
