package chap_07.Car;

public class KiaCar {
    public String company;
    public String model;
    public String color;
    public int price;

    public KiaCar() {
    }

    public void carInfo() {
        System.out.println("제조사: " + this.company);
        System.out.println("모델: " + this.model);
        System.out.println("색상: " + this.color);
        System.out.println("가격: " + this.price);
    }

    public void speedUp() {
        System.out.println("엑셀을 밟는다.");
    }

    public void speedDown() {
        System.out.println("브레이크를 밟는다.");
    }
}
