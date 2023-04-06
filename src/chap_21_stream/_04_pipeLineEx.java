package chap_21_stream;

import chap_21_stream.clazz.CreaitCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _04_pipeLineEx {
    public static void main(String[] args) {
        List<CreaitCard> cardList = new ArrayList<CreaitCard>();

        /*
         * 카카오, 라이언카드, 1000
         * 삼성카드, 탭탭카드, 2000
         * 신한카드, 드림카드, 3000
         * 삼성카드, ID카드, 5000
         * 현대카드, 더블랙, 100000
         * 아멕스, 블랙카드, 300000
         */
        //스트림으로 한도가 5000이상인 카드의 회사와 카드이름 출력

        cardList.add(new CreaitCard("카카오","라이언카드",1000));
        cardList.add(new CreaitCard("삼성카드","탭탭카드",2000));
        cardList.add(new CreaitCard("신한카드","드림카드",3000));
        cardList.add(new CreaitCard("삼성카드","ID카드",5000));
        cardList.add(new CreaitCard("현대카드","더블랙카드",100000));
        cardList.add(new CreaitCard("아멕스","블랙카드",300000));



        //2. 체이닝 기법... 간단한 방법?
//        cardList.stream()
//                .filter(card -> card.getLimitMoney()>= 5000)
//                .forEach(card ->
//                        System.out.println("[한도 5000 이상 -> ] " + "회사명: " +
//                                card.getCompany() + ", 카드이름: " + card.getCardName()));


//        //1. 첫번째 방법!!
//
//        Stream<CreaitCard> cListStream = cardList.stream();
//        //필터링해서 새 스트림 구성
//        //조건에 대해 참인 것들만 필터링이 되어서 들어감.
//        //여기서는 한도 5000이상인 카드가 들어가는 것.
//        Stream<CreaitCard> limitStream = cListStream.filter(ls ->ls.getLimitMoney() >=5000);
//
//        //요소 하나하나 접근한다 for each
//        limitStream.forEach(card -> System.out.println(card.getCompany() + " : " + card.getCardName()));


        //map() : 새로운 스트림을 만들어서 리턴
        // 실행코드의 결과값으로 새로운 스트림 생성
        cardList.stream().map(ls -> {
            ls.setCompany("삼성카드");
            ls.setLimitMoney(ls.getLimitMoney() + 3000);
            return ls;
        }).forEach(card -> System.out.println(card.toString()));
        //=> 이렇게 출력하면 회사는 삼성카드로 바뀌고, 한도는 +3000 으로 바뀐 새 스트림 생성이 된다.

        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 1; i <= 30 ; i++) {
            intList.add(i);
        }
       int sum = intList.stream().reduce((result,num) -> result + num).get();
        System.out.println(sum);
    }
}
