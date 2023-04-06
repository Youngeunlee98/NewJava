package chap_15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {
    public static void main(String[] args) {
        // 사용자가 5개 정수 입력
        //Math.max 와 Math.min을 이용해서 최소 최대 구하기
        // 입력받아 배열에 저장

        Scanner sc = new Scanner(System.in);


        System.out.print("5개의 정수를 입력하고 최소, 최댓값을 구합니다.");
        int userInput = Integer.parseInt(sc.nextLine()); // 사용자 입력할 곳
        int[] data = new int[5]; // 입력받은 정수를 배열 로 담기


        //입력받고 배열에 저장하는 과정
        for (int i = 0; i <data.length; i++) {
            data[i] = Integer.parseInt(sc.nextLine());
            System.out.println("숫자를 입력하세요");
        }





    }
}
