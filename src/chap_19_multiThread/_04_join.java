package chap_19_multiThread;

public class _04_join {
    public static void main(String[] args) {
        //join 메소드
        Thread t1 = new Thread(){
          @Override
          public void run(){
              for (int i = 6; i <= 10; i++){
                  System.out.println(i);
              }
          }
        };
        //t1대기상태로 변경
        t1.start();

        try {
            //메인 스레드를 일시 정지 상태로 만들면서
            //t1의 run이 종료될때까지 대기
            //t1이 run이 종료 -> 메인스레드가 실행 대기로 변경
            t1.join();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        //메인 스레드의 작업
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //어떤 타깃이 실행되는지 ,,,, 잘 확인 해야 함.



    }
}
