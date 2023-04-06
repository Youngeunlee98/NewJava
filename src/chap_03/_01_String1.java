package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        //문자열
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로 변경
        System.out.println(s.toLowerCase()); //소문자로 변경

        //문자열 사이 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true/아니면 false
        System.out.println(s.contains("C#")); //false
        System.out.println(s.indexOf("Java")); //자바라는 문자의 위치정보 알 수 있음 = 7번째/처음은 0번째로 계산함.
        System.out.println(s.indexOf("and")); //처음의 and 위치
        System.out.println(s.lastIndexOf("and")); //마지막 and 위치
        System.out.println(s.startsWith("I like")); //이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); //이 문자열로 끝나면 true

    }
}
