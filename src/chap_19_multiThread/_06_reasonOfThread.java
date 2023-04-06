package chap_19_multiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _06_reasonOfThread {
    public static void main(String[] args) {
        //스레드를 사용하는 이유의 예시01
        //DB를 접속하는..
        //2만명넘는 사람이 동시에 접속? -> 데드락에 걸려서 사용 불가.
        //사용자가 몰렸을때 하나씩 순차처리 역할을 스레드가 한다.

        //사용자 2반명에 대한 스레드 모두 생성
        Thread t = new Thread(){
            @Override
            public void run(){
                selectBoardList();
            }
        };
        t.start();
        //스레드의 순서를 제어.

    }

    static List<Map<String,String>> selectBoardList() {
        List<Map<String, String>> boardList = new ArrayList<Map<String, String>>();
        return boardList;
    }
}
