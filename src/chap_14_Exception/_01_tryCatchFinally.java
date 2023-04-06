package chap_14_Exception;

public class _01_tryCatchFinally {
    //try{}블록 안의 소스코드를 실행하다가 예외가 발생하면 catch{} 블록으로 이동해서 예외처리코드를 실행하는 코드.
    //finally{} 블록은 예외가 발생하던 발생하지 않던 무조건 실행되는 코드블록.
    // 케치 문 열때마다 이름을 다르게 해야 오류가 안생긴다.


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String[] strArr = new String[3];

        int index = 0;


        while (true){
            try {
                System.out.println(arr[index++]);
                //if(index == 2){
                //System.out.println(10/2);
                //} -> 추가적인 예외발생 세분화의 경우의 예시
                strArr[0].length(); //-> null값이 됨
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println(index + "는 배열에 존재하지 않는 인덱스 입니다.");

            }catch (ArithmeticException ae){
            }catch (NullPointerException an){
                System.out.println(an.getMessage());
                System.out.println("널 값이라 사용할 수 없습니다.");
            }
            finally {

                if(index < 3) {
                    System.out.println(" 정상 출력 입니다.");
                }else {
                    System.out.println("예외발생, While문을 종료 합니다.");
                    break;
                }
            }
        }





    }



}
