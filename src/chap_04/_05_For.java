package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 For
        /*
        for( 값 선언 ; 조건 ; 증감 ){
        실행문;
        }
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나이키입니다." + i);
        }

        //짝수만 출력? (fori만 치고 엔터)
        for (int i = 0; i < 10; i+= 2) {
            System.out.print(i);
        }

        //홀수만 출력
        for (int i = 1; i < 10 ; i += 2) {
            System.out.println(i);
        }

        //숫자 거꾸로
        for (int i = 10; i > 0 ; i--) {
            System.out.print(i);
        }
        System.out.println("=====");
        //1부터 10 까지 수들의 합
         int sum = 0;
        for (int i = 1; i < 11 ; i = i + 1) {
            sum += i;
            System.out.println("현재까지의 총합은" + sum + " 입니다.");
        }
        System.out.println("1부터 10 까지의 모든 수의 총합은" + sum + "입니다.");






    }
}