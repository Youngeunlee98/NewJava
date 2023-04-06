package homework._20230403;

import java.util.HashMap;
import java.util.Map;

public class _컬렉션 {
    //--------------------컬렉션--------------------
    //1. 음식 이름을 키로 가지고 단품 가격을 값으로 가지는 foodPriceMap과 음식 이름을 키로 가지고 주문수량을 값으로 가지는 foodOrderMap을 선언하세요.
    //   음식과 가격은 비빔밥 : 6000, 칼국수 : 9000, 투뿔등심 : 70000이고 주문수량은 비빔밥 : 5, 칼국수 : 2, 투뿔등심 : 1 일 때 총가격을 계산해서 출력하세요.
    //   (Map을 이용해서 계산)
    public static void main(String[] args) {
        Map<String, Integer> foodPriceMap = new HashMap<>();
        Map<String, Integer> foodOrderMap = new HashMap<>();

        foodPriceMap.put("비빔밥", 6000);
        foodPriceMap.put("칼국수", 9000);
        foodPriceMap.put("투뿔등심", 70000);

        foodOrderMap.put("비빔밥", 5);
        foodOrderMap.put("칼국수", 2);
        foodOrderMap.put("투뿔등심", 1);

        int totalP = 0;
        for(String Name : foodOrderMap.keySet()){
            int oderCnt = foodOrderMap.get(Name); //주문개수
            int foodP = foodPriceMap.get(Name); //가격

            totalP += oderCnt * foodP;

            System.out.println("총 가격: " + totalP);
        }

    }
}
