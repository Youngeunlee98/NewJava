package chap11_interface;

import chap11_interface.buildings.Buildinghg;

public class _01_interface {
    //인터페이스는 인스턴스화가 불가능, 상속받은 자시글래스를 인스턴스화 해서 사용.
    public static void main(String[] args) {
        Buildinghg bd = new HighBuilding();

        bd.build();
        bd.turnOnAircon();
        int price = bd.getParkingPrice(4);
        System.out.println("총 주차비는 " + price + "원 입니다.");

    }
}
