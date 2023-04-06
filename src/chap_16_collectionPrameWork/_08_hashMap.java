package chap_16_collectionPrameWork;

import chap_06_class.Car.Car;

import java.util.*;

public class _08_hashMap {
    public static void main(String[] args) {
        //hashMap
        Map<String, String> carMap = new HashMap<String,String>();

        //Key, Value의 쌍 저장
        carMap.put("company", "현대");
        carMap.put("model", "제네시스");
        carMap.put("color", "검정색");
        carMap.put("price", "4500");

        //출력
        System.out.println(carMap); //{color=검정색, price=4500, company=현대, model=제네시스}

        // map에 어던데이터가 들어있는지 모르면 entry의 Set을 생성하고
        //iterator 꺼내서 Key,Value를 하나씩 확인 한다.
        Set<Map.Entry<String,String>> carSet = carMap.entrySet();
        System.out.println(carSet.toString());

        //itarator사용

        Iterator<Map.Entry<String,String>> it = carSet.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> ent = it.next();
            System.out.println(ent.getKey());
            System.out.println(ent.getValue());
        }


        Map<String, Object> objMap = new HashMap<String,Object>();
        List<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < 5; i++) {
            Car car = new Car("현대", "제네시스" +(10 + i), "검정", 3000);
            carList.add(car);
        }
        objMap.put("carList", carList);




    }
}
