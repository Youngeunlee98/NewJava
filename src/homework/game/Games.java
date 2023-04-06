package homework.game;

import java.util.Scanner;

public class Games {

    NumBaseball NumGame = new NumBaseball();
    RockScissPaper rspGame = new RockScissPaper();
    Lotto lGame = new Lotto();


    public void start(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("게임을 골라주세요");
            System.out.print("1: 숫자야구, 2: 가위바위보, 3: 로또, 0: 종료>>");

            int n = sc.nextInt();

            switch (n){
                case 0:
                    System.out.println("종료합니다.");
                    System.exit(0);
                case 1:
                    NumGame.start(); break;
                case 2:
                    rspGame.start(); break;
                case 3:
                    lGame.start();break;
                default:
                    System.out.println("다시 입력 하세요.");
            }
        }
    }

}
