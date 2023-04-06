package homework._02_0315team;

import java.util.Scanner;

public class middle_while {
    public static void main(String[] args) {
        //1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
        //   while문내에 조건문을 넣어주면 됨
        System.out.println("---------1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요--------");
        int i = 0; // 짝수 값을 담을 변수
        while (i <= 10) {
            i++; // 반복할때마다 a를 1씩 증가시켜 10일때까지
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //2. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
//   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요
        System.out.println("--------1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,\n" +
                " 그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요------");

        int sum = 0;
        for (int j = 1; j <= 1000; j++) {
            if (j % 2 == 0 && j % 7 == 0) {
                sum += j;
            }
        }
        System.out.println(sum);
        //3. 구구단을 이렇게 출력하세요
        System.out.println("----------3. 구구단을 이렇게 출력하세요 -> 2~9단까지--------");
        for (int a = 1; a<= 9; a++){
            for (int b = 2; b <=9; b++){
                System.out.print(a + "*" + b + "=" + a*b + " " ); //print
            }
            System.out.println();


        }




        //4. 가위, 바위, 보 게임을 만드세요.
        System.out.println("4. 가위, 바위, 보 게임을 만드세요.");
        //안내면 진 거 ~ 가위 ~ 바위 ~ 보!
        int user=0;
        int com=(int)(Math.random()*3); // 0,1,2
        Scanner scan=new Scanner(System.in);
        System.out.println("===========가위바위보 게임을 시작합니당!============");
        System.out.println("가위(0), 바위(1), 보(2) 입력 : ");
        user=scan.nextInt();

        //결과 값 출력
        switch (com) {
            case 0:
                switch(user)
                {
                    case 0:
                        System.out.println("컴퓨터 : 가위,  사용자 : 가위");
                        System.out.println("비겼습니다.");
                        break;
                    case 1:
                        System.out.println("컴퓨터 : 가위,  사용자 : 바위");
                        System.out.println("사용자 Win!!");
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 가위,  사용자 : 보");
                        System.out.println("컴퓨터 Win!!");
                        break;
                }
                break;
            case 1:
                switch(user)
                {
                    case 0:
                        System.out.println("컴퓨터 : 바위,  사용자 : 가위");
                        System.out.println("컴퓨터 Win!!");
                        break;
                    case 1:
                        System.out.println("컴퓨터 : 바위,  사용자 : 바위");
                        System.out.println("비겼습니다.");
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 바위,  사용자 : 보");
                        System.out.println("사용자 Win!!");
                        break;
                }
                break;
            case 2:
                switch(user)
                {
                    case 0:
                        System.out.println("컴퓨터 : 보,  사용자 : 가위");
                        System.out.println("사용자 Win!!");
                        break;
                    case 1:
                        System.out.println("컴퓨터 : 보,  사용자 : 바위");
                        System.out.println("컴퓨터 Win!!");
                        break;
                    case 2:
                        System.out.println("컴퓨터 : 보,  사용자 : 보");
                        System.out.println("비겼습니다.");
                        break;
                }
                break;
            default:
                System.out.println("잘못된 숫자를 입력하였습니다.");
                break;
        }
        System.out.println("============가위바위보 게임을 종료합니당!==============");
    }

}

//



