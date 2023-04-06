package chap_99;

import java.util.Random;
import java.util.Scanner;

public class _06_inputNumRandom {
    public static void main(String[] args) {
        //System.out.print("1 ~ 200 사이의 숫자를 입력하세요");

        Scanner sc = new Scanner(System.in);

        //컴퓨터는 변수에 1~200까지 랜덤값
        Random random = new Random(); //랜덤값 만드는 아이
        int com = (int)(Math.random() * 200) + 1; // 200까지의 랜덤수



        while (true){
            //사용자 입력 정수 받기 nextInt
            System.out.println("1부터 200까지의 랜덤 값을 맞추세요! : ");
            int input = sc.nextInt();
            //201이면 while문 종료
            if(input > 200){
                System.out.println("랜덤 값의 범위가 벗어나므로 종료합니다.");
                break;
            }
            if(com == input){
                System.out.println("축하합니다. 계속: 1, 종료: 0");
                int go = sc.nextInt();
                if(go == 1){
                    System.out.println("계속합니다.");
                    continue;
                }else {
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }else{
                System.out.println("틀렸습니다. 다시 입력하세요.");
            }

            //com == input -> "축하합니다" "계속 하시겟습니까?"
            //1 => com에 새로운 1 ~ 200 난수, 다시게임 시작
            //0이면 게임 종료

            //틀렸으면 "틀렸습니다. 다시 입력하세요."
            //입력값 다시 받ㄱ
        }
    }
}
