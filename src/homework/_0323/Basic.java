package homework._0323;

import java.util.Scanner;

public class Basic {
    /*
        1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StringBuffer 사용필수).

        2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
            비어있는 바이트의 공간을 a로 모두 채우시오.

        3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)

        4. 문자열 "145.987", "-563.11" 을 double형으로 변경하여
            덧셈의 결과를 출력하세요.

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String userInput1 = sc.nextLine();
        String userInput2 = sc.nextLine();
        String userInput3 = sc.nextLine();

        StringBuffer sb = new StringBuffer();

        sb.append(userInput1);
        sb.append(userInput2);
        sb.append(userInput3);

        String combinedString = sb.toString();

        System.out.println("1번 문자열: " + userInput1 + ", 2번 문자열: " + userInput2 +", 3번 문자열: " + userInput3);
        System.out.println("합친 문자열: " + combinedString);


    }
}
