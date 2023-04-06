package chap_19_multiThread;


import chap_19_multiThread.clazz.BoardDAO;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _17_threadEx {
    public static void main(String[] args) {
        BoardDAO boardDAO = new BoardDAO();
        System.out.println(boardDAO.selectBoardList());
//        ExecutorService es = Executors.newFixedThreadPool(100); //100명의 사용자까지만 동시 처리
//
//        for(int i = 0; i < 20; i++) {
            //아래방식은 스레드가 기후급수적으로 생성-> 과부화발생 가능
            //원하는 최대 스레드 개수지정해서 스레드풀로 관리해야 한다.

//            Thread t = new Thread() {
//                @Override
//                public void run() {
//                    System.out.println(
//                            boardDAO.selectBoardList()
//                    );
//
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            };

            //t.start();
            //스레드 풀에 있는 스레드 작업을 매핑해주고, 스레드 start() 메소드 호출.
            //스레드풀에 스레드가 없으면 대기.
//            es.execute(t);
//        }

//		Thread thread = new Thread() {
//			@Override
//			public void run() {
//				boardDAO.selectBoardList();
//			}
//		};
    }
}

