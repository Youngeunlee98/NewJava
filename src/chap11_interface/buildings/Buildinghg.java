package chap11_interface.buildings;

public interface Buildinghg {
    //모든 변수는 자동으로 상수화 됨
    String price = "expensive"; //인터페이스는 무조건 상수인 변수로!(지정도 반드시)
    int floors = 120;

    //메소드는 자동으로 추상화됨
    void build();
    void turnOnAircon();

    int getParkingPrice(int time);

}
