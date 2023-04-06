package homework.BasicCar;

public class HybridCar implements ElectronicCar,FuelCar{



        @Override
        public void speedUp () {
            System.out.println("자동차의 속력이 올라갑니다.");
        }

        @Override
        public void speedDown () {
            System.out.println("자동차의 속력이 내려갑니다.");
        }

        @Override
        public void charge () {
            System.out.println("자동차를 충전합니다.");
        }

        @Override
        public void addFuel () {
            System.out.println("자동차의 연료를 채워주세요.");
        }

}
