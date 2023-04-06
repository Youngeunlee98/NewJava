package chap_04;

public class _06_While {
    public static void main(String[] args) throws InterruptedException {
        //반복문 While
        /*
        제어변수 선언 및 초기화;
        while(조건식) {
        실행문;
        증감식;
        }
        System.out.println()
         */

        //수영장에서 수영을 하는 모습
        int distance = 25;
        int move = 0;
        while (move < distance){
            System.out.println("수영중입니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착하였습니다!");

        //move += (증감식조건)을 안쓰면 무한 루프 발생.

        final int MAX_CONNECTION = 20;
        int userCnt = 0;
        while (true){
            userCnt++;

            System.out.println("현재 사용자 수: ");
            if(userCnt > MAX_CONNECTION){
                break;
            }
                Thread.sleep(1000);
            }
        System.out.println("DB 연결이 모두 사용 중입니다.");
        }
    }

