package chap_01;

public class _06_constants {
    public static void main(String[] args) {
        //상수는 절대 변하지 않는 값.
        //상수는 대문자로 설정하기
        String KR_COUNTRY_CODE = "+82"; //국가번호
        KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; //원주율
        final  String DATE_OF_BIRTH = "1998-06-13";//생년월일
    }
}
