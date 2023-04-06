package homework._20230330HW;

import java.util.Scanner;

public class _형변환 {
    /*
    1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.

2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)

3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.

4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.

5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.

6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.

     */
    public static void main(String[] args) {
        //1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.
        Scanner sc = new Scanner(System.in);
        //정수를 문자열로 받기
        System.out.println("정수 2개중 정수 1 입력 : ");
        String num1 = sc.nextLine();
        System.out.println("정수 2개중 정수 2 입력 : ");
        String num2 = sc.next();
        //String to int로 형변환
        int num11 = Integer.parseInt(num1);
        int num22 = Integer.parseInt(num2);
        //합 출력
        System.out.println(num11 + num22);
//
//        //2.사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.
//        // (단, b는 0을 입력할 수 없습니다.)
        System.out.println("정수 a: ");
        int a = sc.nextInt();
        System.out.println("정수 b: ");
        int b = sc.nextInt();

        System.out.println("a와 b의 나누기 연산 결과(double): " + "a / b = " + ((double)(a/b)));

//        //3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
        System.out.println("실수 한개 입력: ");
        double num = sc.nextDouble();
        //정수형으로 형변환해서 출력
        System.out.println((int) num);
//
//        //4.사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
        System.out.println("실수 한개 입력: ");
        double numm = sc.nextDouble();

        //제곱 결과 문자열로
        String str = String.valueOf((numm * numm));
        System.out.println(str);

        //5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
        int iNum = 10;
        long lNum = 20;
        int n = Math.toIntExact(Long.valueOf(lNum));
        n = iNum;
        iNum = 20;
        long l = (int)iNum;
        l = lNum;
        lNum = 10;
        System.out.println("iNum: " + iNum + ", lNum: " + lNum);

        //6.사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
        System.out.println("문자를 입력하세요 1.:");
        String alpha1 = sc.nextLine();
        System.out.println("문자를 입력하세요 2.:");
        String alpha2 = sc.next();

        StringBuffer sb = new StringBuffer();








    }
}
