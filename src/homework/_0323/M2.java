package homework._0323;

import java.util.Scanner;

public class M2 {
    /*
     2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
         사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.
     */
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");

        sb1 = sb1.reverse(); // 거꾸로 함수
        System.out.println("문자열 거꾸로 출력: " + sb1); // 문자 거꾸로 출력하기

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하새요: ");
        int userInput = Integer.parseInt(scanner.nextLine()); // 사용자가 정수 입력하기

        //입력받은 정수 만큼의 인덱스 = a라고 하면,
        //sb1 문자열의 인덱스 중 a번째 인덱스의 문자를 출력할 것.

        char ch = sb1.charAt(userInput);

        System.out.println(ch);

        // Char charAt(int index) : String 문자열에서 index 번째 문자 값 1개를 가져온다





    }
}
