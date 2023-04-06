package chap_99.etc.game;

import java.util.Random;
import java.util.Scanner;

public class numBaseBall {
    //게임룰: 컴이 3개의 랜덤 값을 가지고
    // 사용자가 3개의 숫자를 입력 (중복 불가능)
    //컴퓨터의 3개의 숫자와 사용자의 3 개 숫자 비교,
    // 숫자만 같으면 볼
    //숫자와 위치까지 모두 같으면 스트라이크
    //몇 스트 몇 볼인지?
    //3 스트라이크  = 게임 종료
    //종료 후 다시할건지? 1: 재게임 , 0: 종료

    //스트라이크와 볼의 개수를 세어줄 변수
    private int strike = 0;
    private int ball = 0;

    //몇 번 맞췄는지 세어줄 변수
    private int gameCnt = 0;

    //컴퓨터 랜덤값 담아줄 배열
    int[] com = new int[3];

    //사용자 입력값 저장할 배열
    int[] user = new int[3];

    Scanner sc = new Scanner(System.in);
    Random r = new Random();


    //게임 스타트 메소드


    //사용자 입력값 확인

    //컴퓨터 랜덤 값 3개 생성해주는 메소드


    //중복값 체크 메소드


    //유저의 입력값을 받아서 배열에 담아주는 메소드


    //스트라이크 볼 판정하는 메소드


    //재게임 여부

}