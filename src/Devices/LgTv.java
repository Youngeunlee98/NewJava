package Devices;

public class LgTv implements TV{


        @Override
        public void show () {
            System.out.println("LgTV를 전시합니다.");
        }

        @Override
        public void powerOn () {
            System.out.println("LgTV 전원을 킵니다.");
        }

        @Override
        public void powerOff () {
            System.out.println("LgTV 전원을 끕니다");
        }

        @Override
        public void sound () {
            System.out.println("LgTV의 소리를 재생합니다.");
        }

        @Override
        public void changeChannel (int channel)
        {
            System.out.println("\"LgTV 채널을 \"+channel + \"번 으로 변경합니다.\"");
        }
    }

