package chap_09_polymorphism.product;

import chap_09_polymorphism.ElectronicDevice;

public class Tv extends ElectronicDevice {
    public int lastChannel;
    public void powerOn(){
        System.out.println("TV의 전원을 킵니다.");
        moveTo(lastChannel);
    }

    public void powerOff(){
        System.out.println("TV의 전원을 끕니다.");
        moveTo(lastChannel);
    }

    public void operate(){

    }

    public void moveTo(int channel) {
        System.out.println(channel + "로 이동합니다.");
    }

    public void channelUp() {
        lastChannel++;
    }

    public void channelDown() {
        lastChannel--;
    }

}
