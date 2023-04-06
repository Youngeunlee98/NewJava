package homework._20230404;

public class _스레드 {
    /*
    1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다.
    각각의 스레드를 실행하십시오.

    2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.

    3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 멤버변수로 int num;를  가지며
    정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고
     num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과
     num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요.
   그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와
   numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서
    두 개의 스레드를 실행하세요.

    4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행 하지 못하도록 잠금 상태로 만드세요.

    5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
     */
    public static void main(String[] args) {
        // 1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고
        // 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다.
        //    각각의 스레드를 실행하십시오.

        //2번 문제 합침


        Thread t1 = new Thread(){
          @Override
          public void run(){
              for (int i = 1; i <= 20 ; i++) {
                  if (i % 12 == 0){
                      System.out.println(i);
                  }
                  try {
                      Thread.sleep(500);
                  }catch (InterruptedException ie){
                      System.out.println(ie.getMessage());
                  }
              }
          }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                for (int i = 1; i <= 20 ; i++) {
                    if(30 % i == 0){
                        System.out.println(i);
                    }
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException ie){
                        System.out.println(ie.getMessage());
                    }
                }
            }
        };
        t1.start();
        try {
            t1.join();
            t2.start();
            t2.join();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }

    }
}

class Main {
    //3번문제
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        np.setNum(10);

        Thread1 thread1 = new Thread1(np);
        Thread2 thread2 = new Thread2(np);

        thread1.start();
        thread2.start();
    }
}

class main2{
    // 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지
    // 두 번째 스레드를 실행 하지 못하도록 잠금 상태로 만드세요.


}

