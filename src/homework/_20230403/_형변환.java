package homework._20230403;

import java.util.Scanner;

public class _형변환 {
    public static void main(String[] args) {
//        //1. 사용자가 입력한 수(실수나 정수 모두 가능)를 StringBuilder로 받아서
//        // 점(.)이 포함되면 double형으로 포함되지 않으면 int형으로 변경 후 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.println("실수/정수를 입력하세요: ");
        int num = sc.nextInt();

        StringBuilder sb = new StringBuilder(num);
        sb.append("입력한 수는 ");



    }
}

