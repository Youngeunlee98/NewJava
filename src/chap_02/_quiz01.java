package chap_02;

public class _quiz01 {
    public static void main(String[] args) {
        //어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하십시오.
        //조건1) 키가 120cm 이상인 경우에만 탑승 가능.
        //조건2) 삼항 연산자 이용.
        int height = 115;
        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로 " + result);

        //만 19세 미만 주류판매 금지
        int age = 20;
        String out = (age < 19) ? "주류 판매가 불가능 합니다." : "주류 판매가 가능합니다.";
        System.out.println("현재 나이가 " + age + "세 이므로 " + out);


        //9시 30분 까지는 정상 출석 인정, 9시 30분 초과시 지각 처리 프로그램
        double hour = 10;
        String timeCheck = (hour <= 9.5) ? "정상 출석 인정되었습니다" : "지각 처리 되었습니다.";
        System.out.println(timeCheck);


    }
}
