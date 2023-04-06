package chap_04;

public class _quiz_for {
    public static void main(String[] args) {
        int sum =0;
        int i;

        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100 까지의 합은 " + sum);
        System.out.println("마지막 i의 값은 " + i);


        /*
        int num = 0;

        for (int j = 0; j <= 1000 ; j++) {
            if(j % 13 == 0 && j % 23 == 0){
                num += j;
                System.out.println(j);
                if( num > 500){
                    break;
                }
            }
            System.out.println("for문 밖의 j; " + j);
        }
        System.out.println("12, 13의 공배수의 합이 500을 넘을 때");

         */

        //for문의 중첩
        /*

        for ( ) {
            for ( ){
           }
        }

        내부의 for문 조건이 거짓이 될때까지 반복하고 다시 외부의 for문의 증감식으로 이동.
        중첩되어있는 내부의  for문에서 break문을 사용하면 내부 for문만 종료
        >>>>>.외부 for문이 종료되면 내부는 다시 실행 X - > for문 전체가 종료된 것 이랑 동일.<<<<<
         */
        int num1= 1;
        int num2= 0;

        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                a += b;
            }
        }
        System.out.println(num1);
    }

}
