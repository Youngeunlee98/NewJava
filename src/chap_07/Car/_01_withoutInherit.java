package chap_07.Car;


public class _01_withoutInherit {


        public _01_withoutInherit() {
        }

        public static void main(String[] args) {
            Car car = new Car();
            KiaCar kCar = new KiaCar();
            HyundaiCar hCar = new HyundaiCar();
            car.company = "GM";
            kCar.company = "Kia";
            hCar.company = "Hyundai";
        }
}
