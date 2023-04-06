package chap_06_class;

import chap_06_class.Car.Car;

public class _04useOfCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.company = "현대";
        car.model = "제네시스";
        car.color = "검정";
        car.money = 5000;

        car.carInfo();

        Car car2 = new Car();

        System.out.println("----내 드림카----");
        car2.company = "볼보";
        car2.model = "튼튼한 볼보";
        car2.color = "갈색";
        car2.money = 8000;

        car2.carInfo();
    }
}
