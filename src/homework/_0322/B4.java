package homework._0322;

import java.util.Scanner;

public class B4 {
    /*
        4. 사용자가 입력한 문자열1, 문자열2
         문자열1이 문자열2를 포함하면
       '포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력할 스캐너 준비

        System.out.print("1번 문자열을 입력하세요: ");
        String userInput = scanner.nextLine(); // 사용자 입력할 곳

        System.out.print("2번 문자열을 입력하세요: ");
        String userInput2 = scanner.nextLine(); // 사용자 입력할 곳


        if (userInput.contains(userInput2)){
            System.out.println("포함합니다.");
        }else {
            System.out.println("포함하지 않습니다.");
        }


    }

}
