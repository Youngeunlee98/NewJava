package homework._0323;

import java.util.Scanner;

public class M4 {
    /*
    4. 재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.
     */

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum( n- 1); // 사용자 입력 값에서 1 이 될때 까지 더하는 재귀함수이용 식.
        } // 재귀                        // 여기서 n 은 사용자 입력값.
    }

    public static void main(String[] args) {
        //재귀메소드 함수 : 메소드 안에서 해당 메소드를 다시 호출

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하새요: ");
        int n = sc.nextInt() ; // 사용자가 정수 입력하기

        int result = sum(n);
        System.out.println("합: " + result);






    }
}
