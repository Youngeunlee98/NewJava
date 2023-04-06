package chap_15_usefulClass;

public class _06_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("bitcamp");
        StringBuffer sb2 = new StringBuffer("bitcamp");

        System.out.println(sb1 == sb2);
        //equals가 오버라이딩 되어있지 않아서 문자열의 값을 비교 X
        //그래서 같은 객체인지만 비교.
        System.out.println(sb1.equals(sb2));

        //문자열로 변환해서 값을 비교한다.
        String str1 = sb1.toString(); // false
        String str2 = sb1.toString(); //false

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //false -> 값은 같지만 주소의 값은 다르다. 왜? -> string이니까.






    }
}
