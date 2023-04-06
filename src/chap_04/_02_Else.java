package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 if ~ else 문
        //if문과 다르게 참과 거짓을 모두 고려함.
        //조건이 참일 때 뿐만 아니라, 거짓일 때 실행될 명령문도 함께 작성.
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 주세요!");
        } else {
            System.out.println("나중에 마실게요!");
        }
        System.out.println("감사합니다~");


        //오후 2시 이거나 이미 커피를 마신 경우 디카페인으로 주문
        hour = 15;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee == false) {
            System.out.println("디카페인 아이스로 주세요!");
        } else {
            System.out.println("아이스 아메리카노로 주세요!");
        }
        System.out.println("감사합니다~!");

        //오전 10시이고 커피도 안마심
        hour = 10;
        boolean yesCoffee = false;
        if (hour >= 14 || yesCoffee == false) {
            System.out.println("아이스 아메리카노로 주세요!");
        } else {
            System.out.println("디카페인 아메리카노로 주세요!");
        }
        System.out.println("감사합니다~!");


        // 오전 8시 이전 이면서 월요일인 경우 출근
        hour = 8;
        boolean workOut = true;
        if (hour <= 8 && workOut == true) {
            System.out.println("출근");
        } else {
            System.out.println("쉬어라");

        }
    }
}
