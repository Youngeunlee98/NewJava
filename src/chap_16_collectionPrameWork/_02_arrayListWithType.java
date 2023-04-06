package chap_16_collectionPrameWork;



import chap_06_class.Car.Car;

import java.util.*;

public class _02_arrayListWithType {
    public static void main(String[] args) {
        //타입을 지정한 ArrayList 선언
        // 선언부와 생성자 부분에 <>이용 타입지정
        ArrayList<String> stringArrayList = new ArrayList<String>();

        //[
        //      {
        //          company: "현대"
        //          model: "아반떼"
        //      }
        // ]
        ArrayList<Car> carArrayList = new ArrayList<Car>();
        Car car = new Car("현대", "아반떼", "검정", 3000);
        carArrayList.add(car);
        Car car2 = new Car("기아", "K7", "검정", 4000);
        carArrayList.add(car2);

        for (int i = 0; i < carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i));
            carArrayList.get(i).carInfo();
        }

        //MapList는 위의 객체 ArrayList와 현ㅇ태는 같다.
        //하지만 메소드는 추가 할 수 없다.
        //map이 열개가 생성되서 쫘르르르르르륵 나옴
        ArrayList<Map<String, String>> mapList = new ArrayList<Map<String,String>>();
        for (int i = 0; i < 10; i++) {
            Map<String,String> map = new HashMap<String,String>();

            map.put("company", "현대");
            map.put("model", "아반떼20" + (10 + i));
            map.put("price", "4000");

            mapList.add(map);
        }
        for (int i = 0; i < mapList.size(); i++) {
            System.out.println(mapList.get(i));
        }

        //인터페이스를 이용해서 다형성 구현도 가능
        List<String> list = new ArrayList<String>();
        list = new LinkedList<String>();



    }
}
