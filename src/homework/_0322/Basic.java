package homework._0322;

import java.util.Scanner;

public class Basic {
    /*
    1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요.
    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠

    2. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
       0개면 '가, 바가 존재하지 않습니다.'라고 출력.

    3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
       대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u

    4. 사용자가 입력한 문자열1, 문자열2 문자열1이 문자열2를 포함하면
       '포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력
     */

    //1. 가운데 문자 출력
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 사용자 입력할 스캐너 준비

        System.out.print("문자열을 입력하세요: ");
        String userInput = scanner.nextLine(); // 사용자 입력할 곳

        String answer = "";

        if(userInput.length()%2 == 0){
            //짝수일때
            answer = String.valueOf(userInput.charAt((userInput.length()/2)-1) +
                    userInput.charAt(userInput.length()/2));
        }else {
            answer = userInput.charAt(userInput.length()/2) + "";
        }

        System.out.println(answer);




    }
}
