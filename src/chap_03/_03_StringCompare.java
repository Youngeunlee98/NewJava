package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2));// 문자열 내용이 같은지 다른지 비교. false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // equals는 대소문자 구분하므로 false

        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 구분 없이 문자열 내용만 구분. true

        //문자열 비교 심화
        s1 = "1234"; //ex 벽에 붙은 화장실 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true 내용을 비교하는 것
        System.out.println(s1 == s2); //true 참조를 비교하는 것

        s1 = new String("1234");
        s2 = new String("1234");
        //서로 다른 곳에 데이터가 존재하게 됨. 참조가 달라진다는 것.
        //내용은 똑같아서 첫 문장은 true지만 각각 다른데이터로 생각하기 때문에 == 을 통하면 false라고 나옴.
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); //false

    }
}
