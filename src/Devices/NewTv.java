package Devices;

public class NewTv {
    public static void main(String[] args) {

          LgTv tv1 = new LgTv();

          tv1.show();
          tv1.sound();
          tv1.changeChannel(13);
          tv1.powerOn();
          tv1.powerOff();

        System.out.println("--------------");

         SamsungTv tv2 = new SamsungTv();

         tv2.show();
         tv2.sound();
         tv2.changeChannel(5);
         tv2.powerOn();
         tv2.powerOff();

    }
}
