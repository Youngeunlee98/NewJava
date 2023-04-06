package chap_99;

import java.util.Random;

public class _05_dbjRandom {
    public static void main(String[] args) {
        //2.랜덤 정수 생성 2번째
        //Random 객체
        Random rand = new Random();

        //0~9
        System.out.println(rand.nextInt(10));

        //1~45
        System.out.println(rand.nextInt(45) + 1);
    }
}
