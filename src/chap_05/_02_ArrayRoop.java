package chap_05;

public class _02_ArrayRoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        //하나하나 하기 어려우니 배열을 반복문을 활용하면 된다!
         //for 반복문을 활용하기
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요!");

        System.out.println("=============");

        //배열의 길이를 이용한 순회 lenth는 그 길이를 알려준다!!!!!
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요!");

        System.out.println("=================");

        //for~each (enhanced for) 반복문
        for(String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세용!");

        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요!");

    }
}
