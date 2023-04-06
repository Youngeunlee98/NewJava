package chap_16_collectionPrameWork;

import chap_06_class.Car.Car;

import java.util.*;

public class _09_listMapEx01 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("현대", "제네시스", "검정", 5000));
        carList.add(new Car("BMW", "미니쿠퍼", "검정", 7000));
        carList.add(new Car("현대", "제네시스", "하얀색", 4000));
        carList.add(new Car("기아", "k5", "검정", 5000));
        carList.add(new Car("볼보", "볼보", "남색", 7000));

        //carList를 List<Map<String,Object>>로 변환
        List<Map<String, Object>> mapList = new ArrayList<>();

        for (Car car : carList){ //확장 for문 = for(변수명:배열명){}
            Map<String,Object> carMap = new HashMap<>();
            carMap.put("company", car.company);
            carMap.put("model",car.model);
            carMap.put("color",car.color);
            carMap.put("money", car.money);

            mapList.add(carMap);

        }
        System.out.println(mapList);







    }
}
