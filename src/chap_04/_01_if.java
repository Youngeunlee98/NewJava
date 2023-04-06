package chap_04;

public class _01_if {
    public static void main(String[] args) {
        //조건문 If

        /*실행문;
        if(조건식){
        실행문2;
        }
        실행문3; = 거짓일 때 실행.
         */

        //if 문은 조건식에 if (a > 20 && a < 50) 와 같이 포괄적인 범위 지정이 되지만
        //switch문은 switch (a) {  case 20 : 실행문;  } 이렇게 a가 20일때, 30일때 등등 딱 명시되는 경우만 분류 가능하다.

        int hour = 15;
        if (hour < 14){
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이전이면서 1일 1잔인데 이미 마셧거나 마시지 않았거나..?
        hour = 10;
        boolean morningCoffee = false;  //모닝커피를 마시지 않았다
        //if(hour < 14 && !morningCoffee)
        if(hour < 14 && morningCoffee == false){
            System.out.println("아이스 아메리카노 +1"); //14시 이잔이고 모닝커피를 안마셨으면 +1
        }
        System.out.println("커피 주문 완료"); // = 아이스 아메리카노 +1 커피주문완료.

        //오후 2시이거나 모닝 커피를 마신경우? 디카페인을 주문하고 싶다!
        hour = 15;
        morningCoffee = true;
        if(hour >= 14 || morningCoffee == true){
            System.out.println("디카페인 아이스 +1");
        }
        System.out.println("커피 주문 완료!");


        // 오후 2시이면서 밥을 안먹었을 경우 마라탕을 주문하고 싶다.
        hour = 12;
        boolean food = false;
        if(hour >= 14 && food == false){
            System.out.println("마라탕 주세요!");
        }




    }
}
