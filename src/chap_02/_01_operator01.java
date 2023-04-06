package chap_02;

public class _01_operator01 {
    public static void main(String[] args) {
        // 산술 연산자

        //일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2.5 정수 간의 연산일 경우 소수점은 버려지고 2 가나옴
        System.out.println(2 / 4); //0.5 지만 0
        System.out.println(4 % 2); //4를 2로 나눈 나머지 = 0
        System.out.println(5 % 2); //1

        //우선순위에 따른 연산
        System.out.println(2 + 2 * 2); //곱하기* 먼저 계산 = 6
        System.out.println((2 + 2) * 2); //2+2 먼저 = 8

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); //10

        c = a * b;
        System.out.println(c); //200

        c = a / b;
        System.out.println(c); //2

        c = a % b;
        System.out.println(c); //0

        //증감 연산자 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //val + 1 = 11 ,val에다가 +1 을 하고 답함.

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10, val 다음에 +1 을 출력함.
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9, val - 1
        System.out.println(val); //9

        val = 10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); //9

        // ex)은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 :" + waiting++); //대기인원 0 다음부터 +1
        System.out.println("대기 인원 :" + waiting++); //대기인원 1
        System.out.println("대기 인원 :" + waiting++); //대기인원 2
        System.out.println("총 대기 인원 :" + waiting); //총 대기 인원 3
    }
}

