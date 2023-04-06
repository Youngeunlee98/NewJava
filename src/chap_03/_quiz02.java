package chap_03;

public class _quiz02 {
    public static void main(String[] args) {
        //주민등록 번호에서 생년월일 밑 성별까지만 출력하는 프로그램을 만드시오.
        //참고1) 13자리 숫자
        //참고2) 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별정보
        //참고3) 입력데이터 -을 포함한 12자리의 문자열 형태

        String a = "980613-2352910";
        System.out.println(a.substring(0,8)); //0~8 직전까지의 코드를 나타냄.

    }
}
