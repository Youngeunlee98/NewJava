package chap_15_usefulClass;

import java.math.BigInteger;

public class _11_integer {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100);
        Integer num2 = Integer.valueOf(100);

        //주소값 비교 같은객체를 바라본지 확인
        System.out.println(num1 == num2); //true

        //equals메소드가 오버라이딩되어 있어 값만 비교한다.
        System.out.println(num1.equals(num2)); //true
        //작으면 -1 같으면 0 크면 +1
        System.out.println(num1.compareTo(num2)); //0

        //문자열을 정수형으로 변환
        String nymStr = "1000";
        int covertNum = Integer.parseInt(nymStr); // 문자열을 정수형으로 바꿔주는 메소드
        System.out.println(covertNum); //정수 1000
        System.out.println(Integer.valueOf(covertNum));

        //int의 최대값, 최솟값을 상수인 멤버변수로 지정해놔서, 멤버변수 호출하면 확인 가능하다.
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE); //-2147483648

        //문자열로 변환
        String convertStr = num1.toString(); //문자열로 변환하면
        System.out.println(convertStr.getClass()); //변환된 클래스 형태 확인

        //사이즈, 바이트, 타입
        System.out.println("size: " + num1.SIZE); //32
        System.out.println("byte: " + num1.BYTES); //4
        System.out.println("type: " + num1.TYPE); //int

        //문자열을 정수형으로 변환
        //System.out.println(Integer.parseInt("FF")); //-> 에러 발생
        System.out.println(Integer.parseInt("FF",16)); // 16진수로 변경해달라고 한것이기 때문에 나옴



    }
}
