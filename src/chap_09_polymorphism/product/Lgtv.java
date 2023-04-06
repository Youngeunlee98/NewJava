package chap_09_polymorphism.product;

public class Lgtv extends Tv{
    public void powerOn(){
        System.out.println("제조사 : lg");
        super.powerOn();
    }

    public void powerOff(){
        System.out.println("제조사 : lg");
        super.powerOn();
    }
}
