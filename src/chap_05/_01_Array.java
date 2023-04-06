package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형을 값 여러개를 저장하는 연속된 공간
        /*
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카" ;
        String coffeehelen = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        ......
        */

        //배열 선언 첫번째 방법
        //String[] coffees = new String[4]; // 크기 4개의 똑같은 string 데이터를 가지는 배열을 만든 것.

        //배열 선언 두번째 방법
        //String[] coffees[] = new String[4];
        /*
        coffees[0] = "아메리카노"; //인덱스 값은 0부터 시작.
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";
        */

        //배열 선언 세번째 방법
        //String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //배열 선언 시 여러개 동시접근 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("================");

        //커피 주문
        System.out.println(coffees[0] + " 하나"); //아아 하나
        System.out.println(coffees[1] + " 하나"); //카페모카 하나
        coffees[2] = "에스프레소"; // 중간에 값도 변경 가능
        System.out.println(coffees[2] + " 하나"); //라떼->에스프레소로 변경
        System.out.println(coffees[3] + " 하나"); // 카푸치노 하나
        System.out.println("주세요!");

        //다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};





    }
}
