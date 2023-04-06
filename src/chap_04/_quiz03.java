package chap_04;

public class _quiz03 {
    public static void main(String[] args) {
        //조건문 활용 주차 요금 정산 프로그램을 만드시오.
        //조건1) 시간당 4000원 (일일 최대 요금은 30000원)
        //조건2) 경차 또는 장애인 차량은 최종요금에서 50% 할인

        //일반차량 5시간 주차요금은 20000원 입니다
        //경차 5시간 주차요금은 10000원 입니다.
        //장애인 차량 10시간 주차요금은 15000원 입니다.

        int hour = 10;
        boolean smallCar = false; //경차 여부
        boolean person = true; //장애인 차량 여부

        int fee = hour * 4000; //시간당 4000원 곱하기

        //주차 정산 최대요금은 30000원
        if(fee>30000){
            fee = 30000;
        }

        //요금50%할인
        if(smallCar || person){
            fee/=2;
        }

        System.out.println("주차요금은 " + fee + "원 입니다.");


    }
}
