package homework._20230330HW;

import java.util.Arrays;
import java.util.Scanner;

public class _변수 {
    /*
    1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.

2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.

3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
    단, 원주율 3.14는 상수로 선언하세요.

4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.

5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.

6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
											  2 * 2 = 4
											  .....
											  2 * 9 = 18

7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)

8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
   사용자가 입력할 수 있는 값은 2 ~ 30로 제한

     */
    public static void main(String[] args) {
        //1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("성별을 입력하세요: ");
        String gender = sc.next();

        System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + gender);

        //2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
        System.out.println("정수 1 입력: ");
        int num1 = sc.nextInt();
        System.out.println("정수 2 입력: ");
        int num2 = sc.nextInt();
        System.out.println("문자연산자 입력: ");
        String c = sc.next(); //char

        System.out.println(num1 + c + num2 );
//
//        //3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.
        //      (넓이 : 3.14 * 반지름 ^ 2, 둘레 : 2 * 3.14 * 반지름)
        //    단, 원주율 3.14는 상수로 선언하세요.

        double pie = 3.14;
        int radius = 20; //반지름
        double area = (pie * 20 * 20); //넓이
        double round = (pie * 2 * radius); //둘레

        System.out.println("원의 넓이: " + area + ", 원의 둘레: " + round);
//

        //4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
        System.out.println("정수1 입력: ");
        int a = sc.nextInt();
        System.out.println("정수2 입력: ");
        int b = sc.nextInt();
        System.out.println("정수3 입력: ");
        int bb = sc.nextInt();
        System.out.println("정수4 입력: ");
        int d = sc.nextInt();
        System.out.println("정수5 입력: ");
        int e = sc.nextInt();

        int plus = a + b + bb + d +e;
        int avg = (a + b + bb + d +e) / 5;

        System.out.println("5개의 정수의 합: " + plus + ", 5개의 정수의 합 평균: " + avg);

        //5 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
        System.out.println("정수 1 입력하세요: ");
        int num5 = sc.nextInt();
        System.out.println("정수 2 입력하세요: ");
        int num6 = sc.nextInt();
        System.out.println("정수 3 입력하세요: ");
        int num7 = sc.nextInt();

        int max = num5;
        if (num6 > max) max = num6;
        if (num7 > max) max = num7;
        System.out.println("최댓값은 " + max);

        int min = num5;
        if (num6 < min) min = num6;
        if (num7 < min) min = num7;
        System.out.println("최솟값은 " + min);

        if (num5 <= num6)
            if (num6 <= num7) {
            }// 중간

        //6.사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
        //											  2 * 2 = 4
        //											  .....
        //
        System.out.println("정수를 입력하세요: ");
        int multi = sc.nextInt();

        System.out.println("해당 정수의 구구단으로 출력합니다. ");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(multi + "*" + i + " = " + (multi*i));
        }

        //7.사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)

        System.out.println(" 팩토리얼 계산을 위한 정수를 입력해주세요. : ");
        int input1 = sc.nextInt();
        int fac = 1;	// 초기값 설정
        for (int i = input1; i > 0; i--) { // (int i=1; i<=num; i++) 조건식을 다음과 같이 변경해도 동일 동작.
            fac = fac * i;	// fac *= i;
        }
        System.out.println(input1 + "! = " + fac);

        //8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
        //   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
        System.out.println("5개 정수를 입력하세요 : ");
        int [] arr = new int [5];
        for (int i = 0; i < 5; i++ ) {
            arr[i] = sc.nextInt();
        }
        System.out.println("배열로 5개 정수 입력 완료 ");

        System.out.println(Arrays.toString(arr));
        for (int q = 0; q < 5 ; q++ ) {
            int cnt = 0;
            for (int i = 1; i < arr[q]; i++ ) {
                if(arr[q] % i == 0 ) {
                    cnt++; // 나머지가 0이면 소수가 아니다.
                }
            }
            if ( cnt == 1 ) { // 소수는 1과 자기 자신만 나눌 수 있다.
                System.out.print(" O "); // 그러므로 o
            } else {
                System.out.print(" X ");
            }
        }









    }



    }
