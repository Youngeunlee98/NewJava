package chap_05;

import java.util.Random;
import java.util.Scanner;

public class _08_arrayrocsissorpaper {
    public static void main(String[] args) {

        //4.4. 가위, 바위, 보 게임을 만드세요.
        //        com에 0~2까지의 랜덤값을 발생시키고
        //        (0:가위, 1:바위, 2:보)
        //        사용자가 가위, 바위, 보를 입력하여
        //        com과의 승무패를 출력하세요.

        //가위바위보 10판 진행
        //배열에 각 판의 승무패를 저장
        //배열에 저장된 승,무,패를 세서 몇승 몇무 몇패인지 출력

        Scanner sc = new Scanner(System.in); //사용자 입력값
        Random rd = new Random(); //랜덤객체

        char[] wdlArr = new char[10]; //열판 진행하는데 승무패 저장할 곳 w,d,l




        for (int i = 0; i <10 ; i++) {
            int com = rd.nextInt(3);





            System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
            String input = sc.nextLine(); // 가위바위보를 받을 수 있게 스트링으로 받음
            int inputNum = 0;

            if (input.equals("가위")) {
                inputNum = 0;
            } else if (input.equals("바위")) {
                inputNum = 1;
            } else if (input.equals("보")) {
                inputNum = 2;
            } // 가위가 0 바위 1 보 2 로 받게 변환시켜주는 작업

            if (com == inputNum) {
                wdlArr[i] = 'd';

                System.out.println("비겼습니다.");
            } else {
                if ((inputNum == 0 && com == 2) ||
                        (inputNum == 1 && com == 0) ||
                        (inputNum == 2 && com == 1)) {
                    wdlArr[i] = 'w';

                    System.out.println("이겼습니다.");
                } else {
                    wdlArr[i] = 'l';

                    System.out.println("졌습니다.");
                }
            }
        }
        sc.close();


        //몇승 몇무 몇패인지 출력
        int youWin = 0;
        int comWin = 0;
        int drew = 0;

        for (int i = 0; i <wdlArr.length ; i++) {
            if (wdlArr[i] == 'd'){
                drew++;
            } else if (wdlArr[i] == 'l') {
                comWin++;
            } else if (wdlArr[i] == 'w') {
                youWin++;
            }
        }
        System.out.println(youWin + "승, " + comWin + "패, " + drew + "무 입니다.");


    }
}
