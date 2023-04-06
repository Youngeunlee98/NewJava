package homework._0322;

import java.util.Scanner;

public class M3 {
    /*
    3. 사용자가 입력한 문자열에서 3의 배수 자리의 문자는 3으로 5의 배수 자리의 문자는 5로 변경하여 출력하세요.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력할 스캐너 준비

        System.out.print("문자열을 입력하세요: ");
        String userInput = scanner.nextLine(); // 사용자 입력할 곳
        //String str = "일이삼사오"; // 사용자 입력할 곳
        //String a = ""; //답 넣을 곳

        char[] arr3 = new char[userInput.length()];
        // 3의 배수? >> a % 3 == 0 일 때!
        // 5의 배수? >> a % 5 == 0 일 때!

        char[] arr = userInput.toCharArray();  // 문자열 -> 배열로 변환

        for (int i = 0; i <userInput.length() ; i++) {
            int a = i+1;
            if (a % 3 == 0 ){
                arr3[i] = '3';
            } else if (a % 5 == 0) {
                arr3[i] = '5';
            }else {
                arr3[i] = arr[i];
            }
        }
        String s = new String(arr3);

        System.out.println(s);




    }
}
