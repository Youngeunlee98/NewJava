package chap_16_collectionPrameWork;

import chap_06_class.Car.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _07_Iterator {
    public static void main(String[] args) {
        ArrayList<Car> cList = new ArrayList<Car>();

        Car car = new Car("현대", "제네시스", " 은색", 5000);
        //데이터 타입이 car니까 list에 담기 됨
        cList.add(car);
        car = new Car("기아", "모하비", " 은색", 5000);
        cList.add(car);
        car = new Car("현대", "아반떼", " 검정색", 6000);
        cList.add(car);
        car = new Car("현대", "소나타", " 파란색", 7000);
        cList.add(car);
        car = new Car("기아", "ev6", " 은색", 4000);
        cList.add(car);

        System.out.println(cList.size()); //5

        //Iterator로 요소 받아오기
        Iterator it = cList.iterator();

        while (it.hasNext()){
            Car c = (Car)it.next();
            c.carInfo();
            if (c.company.equals("현대")){
                it.remove();
            }
        }
        System.out.println(cList.size()); //2

        ListIterator<Car> lit = cList.listIterator();
        lit.next();
        while (lit.hasNext()){
            if(lit.previousIndex() == 1){
                lit.previous();

                Car c= new Car("쉐보레", "카마로", "하얀색", 5500);

                lit.set(c);
            }
        }



        for (Car c : cList) {
            c.carInfo();
        }




    }
}
