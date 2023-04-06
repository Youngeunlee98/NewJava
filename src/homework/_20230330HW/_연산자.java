package homework._20230330HW;

import java.util.Scanner;

public class _연산자 {
//    1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//            (메소드로 따로 만들지 말고 메인메소드에서 구현)
//
//    2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
//              21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//
//    3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
//
//    4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//
//    5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
//
//    6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
//
//    7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//
//    8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력해주세요! : ");
        int input1 = sc.nextInt();
        System.out.println("두번째 정수를 입력해주세요! : ");
        int input2 = sc.nextInt();
//
//        //덧셈 +
        System.out.println("입력한 두 수의 덧셈연산 값: " + (input1 + input2));
//        //뺄셈 -
        System.out.println("입력한 두 수의 뺄셈연산 값: " + (input1 - input2));
//        //나눗셈 /
        System.out.println("입력한 두 수의 나눗셈연산 값: " + (input1 / input2));
//        //나머지 %
        System.out.println("입력한 두 수의 나머지연산 값: " + (input1 % input2));
          //곱하기 *
        System.out.println("입력한 두 수의 곱하기연산 값: " + (input1 * input2));

        System.out.println("----------------2-----------------");

        //2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
//              21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20

        int a = 20;
        System.out.println(++a); //21 ,  a + 1
        System.out.println(++a); //22 , 21 + 1
        System.out.println(a++); //22 , 후에 23
        System.out.println(--a); //22 , 23-1
        System.out.println(a--); //22
        System.out.println(--a); //20
        System.out.println(--a); //19
        System.out.println(++a); //20

        //3.사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.

        System.out.println("정수를 입력해주세요: ");
        int input3 = sc.nextInt();
        if((input3 % 14) == 0){
            System.out.println("2와 7의 공배수입니다.");
        }else {
            System.out.println("2와 7의 공배수가 아닙니다.");
        }

        //4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
        System.out.println("문자열을 입력하세요: ");
        String input4 = sc.next();

        System.out.println(input4.equals("Hello"));
//
//        //5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
        System.out.println("정수를 입력해주세요: ");
        int input5 = sc.nextInt();

        String t = "짝수";
        String f = "홀수";
        String result = (((input5 % 2) == 0) ? t : f);

        System.out.println(result);

        //6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼"
        // 작으면 "100보다 작음" 같으면 "100"을 출력하세요.

        System.out.println("정수를 입력해주세요: ");
        int input6 = sc.nextInt();

        String big = "100보다 큼";
        String small = "100보다 작음";
        String same = "100";

        String result2 = (input6 == 100) ? same : (input6 > 100) ? big : small;
        System.out.println(result2);

        //7.사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
        System.out.println("실수 1을 입력해주세요: ");
        double input7 = sc.nextDouble();
        System.out.println("실수 2를 입력해주세요: ");
        double input8 = sc.nextDouble();

        //덧셈 +
        System.out.println("입력한 두 수의 덧셈연산 값: " + (input7 + input8));
//        //뺄셈 -
        System.out.println("입력한 두 수의 뺄셈연산 값: " + (input7 - input8));
//        //나눗셈 /
        System.out.println("입력한 두 수의 나눗셈연산 값: " + (input7 / input8));
//        //나머지 %
        System.out.println("입력한 두 수의 나머지연산 값: " + (input7 % input8));
        //곱하기 *
        System.out.println("입력한 두 수의 곱하기연산 값: " + (input7 * input8));
//
        //사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.

        System.out.println("문자열을 입력하세요: ");
        String inputStr = sc.next();
        System.out.println("정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.println("입력한 문자열은" + inputStr + "이고, " + "입력한 숫자는 " + num1 + "입니다.");







    }






}
