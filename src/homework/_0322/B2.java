package homework._0322;

import java.util.Scanner;

public class B2 {
    /*
    2. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
       0개면 '가, 바가 존재하지 않습니다.'라고 출력.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력할 스캐너 준비

        System.out.print("문자열을 입력하세요: ");
        String userInput = scanner.nextLine(); // 사용자 입력할 곳

        int a = 0;

        for (int i = 0; i < userInput.length(); i+=1) {
            char ch = userInput.charAt(i);
            if (ch == '가' || ch =='바'){
                a = a+1;
                System.out.println("가 또는 바의 개수는 " + a + "개 입니다.");
                break;
            }else{
                System.out.println("가, 바가 존재하지 않습니다.");
                break;
            }
        }




    }
}