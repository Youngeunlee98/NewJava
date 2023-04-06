package chap_04;

import java.util.ArrayList;
import java.util.List;

public class _11_Continue {
    public static void main(String[] args) {
        //continue
        //그다음 조건으로 계속 실행하기

        //반복문이 실행되다가 continue 를 만나면 밑에 코드는 무시하고 다시 반복문의 조건식이나 증감식으로 돌아간다.
        //while문은 증감식이 없어서 조건식으로 돌아감.
        int num = 0;
        while(num<=20){
            num++;
            if(num % 3 == 0){
                continue;
            }
            System.out.println(num);
        }


        System.out.println("################");
        //치킨 주문 손님 중에 노쇼있음
        //for

        int max = 20; // 최대 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; //17번째 손님이 노쇼


        for (int i = 1; i <=50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왓습니다.");

            //손님이 없다면?노쇼
            if(i == noShow){
                System.out.println(i + "번 손님의 노쇼로 인해 다음 손님께 기회가 넘어갑니다.");
                continue;
            }

            sold++;//판매처리
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");



        System.out.println("*********************");

        int mini = 10; // 세일물품 재고수
        int basket = 0; //현재 담은 물건수량
        int noItem = 5; // 5번물건은 품절

        for (int i = 1; i < 10 ; i++) {
            System.out.println(i + "번 물건 남아있습니다.");

            if(i == noItem){
                System.out.println(i + "번 물건은 품절되었습니다.");
                continue;
            }
            sold++; //판매처리
            if (sold == mini){
                System.out.println("금일 세일상품 판매가 종료되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");


        System.out.println("*********************");
        //3.
        List<String> memberList = new ArrayList<String>();

        //모든 회원아이디에 a붙이는 작업
        for (int i = 0; i >= memberList.size(); i++) {

        }


    }
}
