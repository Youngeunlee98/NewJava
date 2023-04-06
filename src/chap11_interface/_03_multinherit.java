package chap11_interface;

import Devices.ElectroncDevice;
import Devices.LgTv;
import Devices.TV;
import chap_09_polymorphism.product.Tv;

public class _03_multinherit {
    public static void main(String[] args) {
        TV tv = new LgTv();

        tv.reset();
        // static메소드를 사용하려면 메소드가 선언된 클래스를 사용해서 호출 한다.
        //static메소드는 상속받은 자식클래스에서의 호출은 불가하다.
        ElectroncDevice.warn();


    }

}
