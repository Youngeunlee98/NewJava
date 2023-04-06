package homework._02_0315team;

import java.util.Scanner;

public class _0315_b {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
//		   while문내에 조건문을 넣어주면 됨
        System.out.println("문제1");
        int n1 = 2;
        while (n1 <= 10) {
            System.out.println(n1);
            //짝수는 2씩 커지기 때문에
            n1 += 2;
        }

//		2. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
//		   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요
        System.out.println("문제2");
        int sum2 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                System.out.println(i);
                sum2 += i;
            }
        }
        System.out.println(sum2);

//		3. 구구단을 이렇게 출력하세요
//		 2x1=2 3x1=3...9x1=9
//		 2x2=4
//		 ...
//		 2x9=18........9x9=81
        System.out.println("문제3");
        //첫번째 줄은 2x1=2	3x1=3	4x1=4	5x1=5	6x1=6	7x1=7	8x1=8	9x1=9	이런식으로 나오기 위해선
        //첫 번째 줄에 공통으로 곱하는 수는 1(int i) 커지는 수는 (int j)   j x i = 결과
        //두 번째 줄은 2x2=4	3x2=6	4x2=8	5x2=10	6x2=12	7x2=14	8x2=16	9x2=18
        //첫 번째 줄에 공통으로 곱하는 수는 1(int i) 커지는 수는 (int j)   j x i = 결과
        //이런식으로 9까지 반복하기
        //"\t"을 사용해서 보기 쉽게

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "x" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
//		4. 가위, 바위, 보 게임을 만드세요.
//		com에 0~2까지의 랜덤값을 발생시키고
//		(0:가위, 1:바위, 2:보)
//		사용자가 가위, 바위, 보를 입력하여
//		com과의 승무패를 출력하세요.
//		(예시) com = 2, 사용자가 바위를 입력하면 => 졌습니다.
//		com=1, 사용자가 바위를 입력하면 => 비겼습니다.
//		com=0, 사용자가 바위를 입력하면 => 이겼습니다.
        System.out.println("문제4");
        Scanner sc = new Scanner(System.in);

        //컴퓨터 변수
        int com;
        //사용자의 값을 입력 받기위한 변수 (가위 바위 보 라는 문자열로 입력을 받아야 함)
        String userStr;
        //컴퓨터와 사용자의 값을 비교하기 위한 변수 3으로 설정한 이유는 (0,1,2를 제외한 아무 수)
        int user = 3;

        //자주 사용하는 문자열을 따로 입력.
        String win = "이겼습니다.";
        String lose = "졌습니다.";

        //컴퓨터의 수를 랜덤으로 생성.
        com = (int) (Math.random() * 3);
        System.out.println("컴퓨터" + com);

        //사용자의 값을 문자열로 받기
        System.out.print("가위바위보>>");
        userStr = sc.next();    //가위 바위 보 중 한 개

        //입력 받은 사용자 값(userStr)은 문자열이기 때문에을 컴퓨터(숫자) 값과 비교하기 쉽게 숫자로 바꿨습니다.
        // 가위는 0, 바위는 1....
        switch (userStr) {
            case "가위":
                user = 0;
                break;
            case "바위":
                user = 1;
                break;
            case "보":
                user = 2;
                break;
            //사용자가 가위, 바위, 보 를 입력하지 않을 경우 user값은 그대로 3

            default:
                System.out.println("잘못입력했습니다.");
        }

        //사용자와 컴퓨터의 수를 비교해서 보여줍니다.
        //user의 값이 3일 경우는 if문에 없기 때문에 그대로 끝
        //비길 경우
        if (com == user) {
            System.out.println("비겼습니다.");
        }
        //사용자가 가위일 경우
        else if (user == 0) {
            if (com == 1) {
                System.out.println(win);
            } else {
                System.out.println(lose);
            }
        }
        //사용자가 바위일 경우
        else if (user == 1) {
            if (com == 2) {
                System.out.println(win);
            } else {
                System.out.println(lose);
            }
        }
        //사용자가 보일 경우
        else if (user == 2) {
            if (com == 0) {
                System.out.println(win);
            } else {
                System.out.println(lose);
            }
        }


    }
}
