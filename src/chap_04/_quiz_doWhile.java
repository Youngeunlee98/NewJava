package chap_04;

public class _quiz_doWhile {
    public static void main(String[] args) {
        /*

        do {
        반복실행 될  소스코드
        } while(조건식);

        {} 안에 소스코드를 무조건 1회 실행 한 후 조건식으로 가서 조건을 판별.
         */

        do{
            System.out.println("무조건 1회 실행");
        }while (1<0);


        System.out.println("================");

        int i = 1;
        do{
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }while (++i <= 20);

    }
}
