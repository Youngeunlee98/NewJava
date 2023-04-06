package Devices;

public class SamsungTv implements TV{


    @Override
    public void show () {
        System.out.println("SamsungTv 전시합니다.");
    }

    @Override
    public void powerOn () {
        System.out.println("SamsungTv 전원을 킵니다.");
    }

    @Override
    public void powerOff () {
        System.out.println("SamsungTv 전원을 끕니다");
    }

    @Override
    public void sound() {
        System.out.println("SamsungTv의 소리를 재생합니다.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("SamsungTv 채널을 "+channel + "번 으로 변경합니다.");
    }
}
