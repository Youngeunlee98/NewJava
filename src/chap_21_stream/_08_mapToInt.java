package chap_21_stream;

import chap_21_stream.clazz.CreaitCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _08_mapToInt {
    public static void main(String[] args) {
        List<CreaitCard> cardList = new ArrayList<CreaitCard>();

        for (int i = 1; i <= 10 ; i++) {
            cardList.add(new CreaitCard("회사" + i, "카드명" + i,
                    100*i));
        }

        Stream<CreaitCard> cardStream = cardList.stream();
        IntStream limitStream = cardStream.mapToInt(card ->
                card.getLimitMoney());

        limitStream.forEach(money -> System.out.println(money));


    }
}
