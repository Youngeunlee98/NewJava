package homework._20230330HW;

import java.util.Scanner;

public class _반복문 {
    /*
    1. 1부터 10까지의 정수의 합을 출력하세요.

2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력

3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.

4. 사용자가 입력한 정수의 약수를  출력하세요.

5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)

6. 사용자가 입력한 문자열을 역순으로 출력하세요.

7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.

8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.

8-1. *
     **
     ***
     ****
     *****

8-2. *****
      ****
       ***
        **
         *

9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
     */
    public static void main(String[] args) {
//        //1. 1부터 10까지의 정수의 합을 출력하세요.
//        System.out.println("--------1---------");
//        int num1 = 0;
//        for (int i = 0; i <= 10 ; i++) {
//           num1 += i;
//        }
//        System.out.println(num1);
//
//        //2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.
//        // (2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//        System.out.println("--------2---------");
//        int a = 2;
//        for (int i = 2; i <= 20 ; i++) {
//            i++;
//            System.out.println(a*i);
//        }
//
//
//
//        //3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//        System.out.println("--------3---------");
        Scanner sc = new Scanner(System.in);
//        System.out.println("정수 입력: ");
//        int inputNum = sc.nextInt();
//
//        for (int i = 2; i <= inputNum; i++) {
//            int cnt = 0;
//
//            for (int j = 2; j <i ; j++) {
//                if (i % j ==0 && i != j){
//                    cnt++;
//                }
//            }
//            if (cnt ==0){
//                System.out.println(i);
//            }
//        }
//
//        //4. 사용자가 입력한 정수의 약수를  출력하세요.
//        System.out.println("--------4---------");
//        int num = sc.nextInt();
//        for (int i = 1; i < num ; i++) {
//            if (i % num == 0){
//                System.out.println(i + " 는 약수 입니다.");
//            }
//        }

        //5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)

//        System.out.println("--------5---------");
//        int[] numArr = new int[10];
//        System.out.println("10개의 정수를 입력해주세요: ");
//        for (int i = 0; i < 10; i++) {
//            numArr[i] = sc.nextInt(); //사용자 입력값을 배열에 저장
//        }
//        for (int i = 9; i >= 0; i--) { // 거꾸로 출력
//            System.out.println(numArr[i]);
//        }
//
//        //6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//        System.out.println("--------6-----------");
//        System.out.println("문자열을 입력해주세요: ");
//        String str = sc.next();
//
//        StringBuffer sb = new StringBuffer(str);
//        String reverse = sb.reverse().toString();
//
//        System.out.println(reverse);


        //7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
        System.out.println("정수 2개를 입력하세요: ");
        int num1 = sc.nextInt();//2
        int num2 = sc.nextInt();//4

        int fff = 0; //최대 공약수
        int ggg = 0; // 최소 공배수
        for (int i = 1; i <= num1 && i<= num2; ++i){
            if (num1 % i == 0 && num2 % i ==0){
                fff = i; // 최대공약수 구하기
            }
        }
        ggg = num1 * num2 / fff; // 최소공배수

        System.out.println("최대공약수: " + fff + ", 최소공배수: " + ggg);
        /*
        Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 2개 입력하세요. ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int i;
		if(num1 > num2) {
			i = num1;
		}else {
			i = num2;
		}

		//최대공약수 구하기
		while(true) {
			if(num1 % i ==0 && num2 % i == 0) {
				System.out.println("최대공약수는 " + i +"입니다.");
				break;
			}
			i—;
		}

		//최소공배수 구하기
		i = 1;

		while(true) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println("최소공배수는 " + i + "입니다.");
				break;
			}
			i++;
		}

         */



    }
}
