package chap_07.Car;

public class Car {

        public String company;
        public String model;
        public String color;
        public int price;

        public Car() {
        }

        public void carInfo() {
            System.out.println("제조사: " + this.company);
            System.out.println("모델: " + this.model);
            System.out.println("색상: " + this.color);
            System.out.println("가격: " + this.price);
        }

        public void speedUp() {
            System.out.println("속도를 올린다.");
        }

        public void speedDown() {
            System.out.println("속도를 줄인다.");
        }
    }

