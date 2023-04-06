package Devices;

public interface ElectroncDevice {
    //powerOn,powerOff
    void powerOn();
    void powerOff();

    default void reset(){
        System.out.println("장치를 리셋합니다.");
    }

    public static void warn(){
        System.out.println("삑 - 경고 알림입니다.");
    }
}
