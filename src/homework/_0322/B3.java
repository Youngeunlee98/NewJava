package homework._0322;

import java.util.Scanner;

public class B3 {
    /*
      3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
       대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력할 스캐너 준비

        System.out.print("문자열을 입력하세요: ");
        String userInput = scanner.nextLine(); // 사용자 입력할 곳


        String[] keywords = {"A", "E", "I" , "O","U","a", "e", "i","o","u"}; // 삭제를 원하는 단어들

        for (String keyword : keywords) {
            userInput = userInput.replaceAll(keyword, ""); //문자배열 활용, replaceAll써서 없애버리기 //확장 for문
        }

        System.out.println("결과: " + userInput); // 짜잔




    }
}
