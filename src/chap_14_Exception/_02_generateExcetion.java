package chap_14_Exception;

public class _02_generateExcetion {
    public static void main(String[] args) {
        try {
            //ArrayIndexOutOfBoundsException aie =
                    //new ArrayIndexOutOfBoundsException("인덱스가 초과됬습니다.");

            //throw aie;
            //1. NullPointerException
                NullPointerException we = new NullPointerException("null 이라 사용할 수 없습니다.");
                throw  we;
            //2.ArithmeticException
                //ArrayIndexOutOfBoundsException ab = new ArrayIndexOutOfBoundsException("산술연산이 잘못되어 사용 할 수 없습니다.");
                //throw ab;
        }catch (NullPointerException we){
            System.out.println(we.getMessage());
            //System.out.println("null 이라 사용할 수 없습니다.");
        }catch (ArithmeticException ab){
            System.out.println(ab.getMessage());
            //System.out.println("산술연산이 잘못되어 사용 할 수 없습니다.");
        }catch (Exception e){
            // 무조건 마지막에 Exception 해야함. 그래야 빠져나갈 녀석이 없음.
            // 마지막 catch문은 위에 선언한 catch문을 다 통과한 예외들을 처리 할 수 있게!
            System.out.println(e.getMessage());
        }






    }
}
