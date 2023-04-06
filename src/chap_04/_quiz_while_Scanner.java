package chap_04;

import java.util.Scanner;

public class _quiz_while_Scanner {
    private static Scanner sc;

    public static void main(String[] args) {
        /*
        while(조건){
        소스코드
        }
         */

        int sum = 0;
        int num = 1;
        while (num <= 100) {
            sum += num++; // 1부터 100 까지의 합
        }
        System.out.println("1~100 까지의 합: " + sum);
        //num이 101이 되는순간 참이 아니기 때문에 while문 종료


        //nestedloop 무한루프 while
        //스캐너 객체
        Scanner sc = new Scanner(System.in);

       /*
       [입력 기능이 있는 메서드]

        next() : 키보드로 입력받은 값의 Type =String
        nextInt() : 키보드로 입력받은 값의 Type = int
        nextFloat() : 키보드로 입력받은 값의 Type =float
        nextDouble() : 키보드로 입력받은 값의 Type =double
        nextLine() : 키보드로 입력받은 값의 Type =String <띄어쓰기까지 모두 입력 받음
        일반적으로 명령어는 sc.next()가 되고 이에 대한 입력 타입은 String형이 된다

        혼용하여 사용하는 것은 좋지 않음.
        */

        while (true) {
            System.out.println("1은 종료. 나머지는 계속");
            String inputStr = sc.nextLine();

            if (inputStr.equals("1")) {
                System.out.println("종료되었습니다.");
                break;
            }
            System.out.println(inputStr);


            //2


            while (true) {
                System.out.println("1~9까지 입력. 0 종료: ");
                num = sc.nextInt();

                if (num == 0 || num == 1) {
                    System.out.println("종료");
                    break;
                }

                for (int i = 2; i < num; i++) {
                    for (int j = 0; j < 9; j++) {
                        System.out.println(i + "*" + j);

                    }
                    System.out.println();
                }

            }


        }
    }
}
