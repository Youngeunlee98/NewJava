package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조선문 Else If문
        //a 있으면 a , 없으면 b, 그것도 없으면 c ......
        //조건식을 여러개 지정 가능.

        //첫번째 참 값 우선 출력.
        boolean iceamericano = true;
        boolean latte = false;

        if(iceamericano) {
            System.out.println("아아 한잔 +1");
        } else if (latte) {
            System.out.println("라떼 한잔 +1");
        } else {
            System.out.println("레몬에이드 +1");
        }
        System.out.println("감사합니다!");

        //else if 여러번 이용 가능
        iceamericano = false;
        latte = false;
        boolean lemonade = false;

        if(iceamericano) {
            System.out.println("아아 한잔 +1");
        } else if (latte) {
            System.out.println("라떼 한잔 +1");
        } else if(lemonade){
            System.out.println("레몬에이드 +1");
        } else{
            System.out.println("마끼아또 +1");
        }
        System.out.println("감사합니다!");


        boolean cowMeat = false;
        boolean pigMeat = false;
        boolean sushi = false;

        if(cowMeat) {
            System.out.println("소고기 주세요!");
        } else if (pigMeat) {
            System.out.println("돼지고기 주세요!");
        } else if (sushi) {
            System.out.println("초밥 주세요!");
        } else{
            System.out.println("나중에 올게요!");
        }

    }
}
