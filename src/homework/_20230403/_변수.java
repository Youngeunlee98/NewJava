package homework._20230403;

import java.util.Scanner;

public class _변수 {
    /*
    1. 두 개의 정수 a = 10; b = 3;으로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(나눗셈의 결과는 double형으로 나머지는 int형으로 출력)

    2. 두 개의 실수 num1 = 10.01; num2 = 12.25;로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(네 연산 모두 double형 출력)

    3. 사용자가 입력한 알파벳을 소문자는 대문자로 대문자는 소문자로 변경해서 출력하세요.

     */
    public static void main(String[] args) {
        //1. 두 개의 정수 a = 10; b = 3;으로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.
        // (나눗셈의 결과는 double형으로 나머지는 int형으로 출력)

        System.out.println("-----1번------");
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double)(a / b));


        System.out.println("-----2번------");
        double num1 = 10.01;
        double num2 = 12.25;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        System.out.println("-----3번------");
        //    3. 사용자가 입력한 알파벳을 소문자는 대문자로 대문자는 소문자로 변경해서 출력하세요.

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //String answer = "";
        //answer += Character.isUpperCase(input) ? Character.toLowerCase() : Character.toUpperCase(c);
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());




    }
}
