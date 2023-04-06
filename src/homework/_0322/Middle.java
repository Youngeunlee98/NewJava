package homework._0322;

import java.util.Scanner;

public class Middle {
    /*
    1. Reverse라는 클래스를 만들고 메소드로
   String reverseString(String str)를 만듭니다.
    매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.

    2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.

    3. 사용자가 입력한 문자열에서 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는 5로 변경하여 출력하세요.
    */
////
    //2 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력할 스캐너 준비

        System.out.print("문자열을 입력하세요: ");
        String userInput = scanner.nextLine(); // 사용자 입력할 곳

        String a = ""; // 답 넣을 친구

        for (int i = 0; i <userInput.length() ; i++) {
            if (userInput.indexOf(userInput.charAt(i))==i){ //1. 내가 입력한 값 중에 중복
                a += userInput.charAt(i); //2. 즉, "userInput" 문자열을 순회하면서 중복되는 문자가 아닌 경우,
            }                               //해당 문자를 "a" 문자열에 추가하는 것
        }
        System.out.println(a); // 답 출력하기







    }






}
