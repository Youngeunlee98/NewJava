package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //switch ~ case 문

        // if 문은 조건식에 if (a > 20 && a < 50) 와 같이 포괄적인 범위 지정이 되지만
        //switch문은 switch (a) {  case 20 : 실행문;  } 이렇게 a가 20일때, 30일때 등등 딱 명시되는 경우만 분류 가능하다.


        //1등 : 전액 장학금, 2등 : 반액 장학금, 3등 : 반액 장학금, 그 외 : 대상 아님.

        int ranking = 1; // 1등 (등수는 정수이기에 int)
        if (ranking == 1){
            System.out.println("전액 장학금 당첨");
        } else if (ranking ==2) {
            System.out.println("반액 장학금 당첨");
        } else if (ranking == 3) {
            System.out.println("반액 장학금 당첨");
        } else {
            System.out.println("장학금대상 아님");
        }
        System.out.println("조회 완료 #1");

        //Switch Case 문을 이용하면?
        ranking = 4;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("대상 아님");
        }
        System.out.println("조회 완료 되었습니다.");

        //case 2 와 3이 같을 때 통합
        ranking = 2;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("대상 아님");
        }
        System.out.println("조회 완료 되었습니다.");

        //등급에 따른 가격 책정의 경우(1등급~3등급)
        int grade = 2;
        int price = 7000; //기본 가격
        switch (grade){
            case 1:
                price+= 1000;
            case 2:
                price+= 1000;
            case 3:
                price+= 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 " + price + "원 입니다.");
        // break를 마지막에 달았기 때문에 밑으로 합산되면서 내려옴 = 1등급:10000원, 2등급:9000원, 3등급:8000원

        // 점수를 입력받아 수우미양가를 출력

        System.out.print("점수를 입력하세요 : ");
        int score = 78;

        if(score <= 10) {
            switch (score) {
                case 10:
                    System.out.println("수");
                    break;
                case 9:
                    System.out.println("우");
                    break;
                case 8:
                    System.out.println("미");
                    break;
                case 7:
                    System.out.println("양");
                    break;
                case 6:
                    System.out.println("가");
                    break;
            }
        }else {
            System.out.println("잘못 입력하셧습니다.");
        }
    }
}
