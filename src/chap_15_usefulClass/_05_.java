package chap_15_usefulClass;

import java.util.Scanner;

public class _05_ {
    public static void main(String[] args) {
        //- replace 메소드 : 지정 문자열을 치환하여 삭제한다.
        //replace메소드는 원래 문자열을 치환하기 위한 메소드이다.
        // 하지만, 이것을 이용해서 문자열을 삭제할 수 있다.
        //
        //문자열.replace(치환하고 싶은 문자열, 새로운 문자, 치환 횟수)

        Scanner scanner = new Scanner(System.in); // 사용자 입력할 스캐너 준비

        System.out.print("문자열을 입력하세요: ");
        String userInput = scanner.nextLine(); // 사용자 입력할 곳

        String[] keywords = {"비트", "네이버", "클라우드"}; // 삭제를 원하는 단어들

        for (String keyword : keywords) {
            userInput = userInput.replaceAll(keyword, ""); //문자배열 활용, replaceAll써서 없애버리기 //확장 for문
        }

        System.out.println("결과: " + userInput); // 짜잔


    }


}

