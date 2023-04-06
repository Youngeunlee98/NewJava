package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 Do While
        /*
        변수선언 및 초기화;
        do {
            실행문;
            증감식;
        }while(조건식);
         */

        int distance = 25; //전체 거리
        int move = 0; //현재 이동 거리
        int height = 2; //키 m

        while(move + height < distance) {
            System.out.println("수영 중 입니다");
            System.out.println("현재 이동 거리 :" + move);
            move += 3; //3m씩 이동
        }
        System.out.println("도착했습니다!");

        //dowhile문을 사용하면?
        distance = 25;
        move = 0;
        height = 25;

        System.out.println("=====반복문2====");

        do{
            System.out.println("수영 중 입니다");
            System.out.println("현재 이동 거리 :" + move);
            move += 3;
        }while (move + height < distance);
        System.out.println("도착했습니다!");




    }
}
