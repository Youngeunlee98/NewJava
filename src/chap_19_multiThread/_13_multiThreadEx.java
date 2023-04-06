package chap_19_multiThread;

public class _13_multiThreadEx {
    public static void main(String[] args) {
        Thread thread = new Thread(){
          @Override
          public void run(){
              for (int i = 1; i <= 10; i++) {
                  if (i % 3 == 0) {
                      System.out.println("1번째: "+i);  //3,6,9
                  }
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
          }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run(){
                for (int i = 1; i <= 10; i++){
                    if (i % 3 ==1) {
                        System.out.println("2번째: "+ i); // 1, 4, 7, 10
                    }
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread3 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    if (i % 3 == 2) {
                        System.out.println("3번째: " + i); // 2, 5, 8
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        thread.start();
        try {
            thread.join();
            //t1이 작업종료 하기 전까지 메인 일시정지 , 아래코드 실행 안됨
            thread2.start();
            thread2.join();
            thread3.start();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
