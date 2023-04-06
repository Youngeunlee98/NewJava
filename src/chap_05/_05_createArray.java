package chap_05;

public class _05_createArray {
    public static void main(String[] args) {
        //배열의 선언
        int[] numArr = new int[5];

        //배열 초기화
        numArr[0] = 14;
        numArr[1] = 16;

        //배열 요소 사용
        System.out.println(numArr[0]);
        System.out.println(numArr[1]);
        //초기화하지 않은 요소 사용시
        System.out.println(numArr[2]);
        System.out.println("=======================");

        //길이가 큰배열 선언
        int[] bigArr = new int[1000];

        //반복문 이용한 배열 초기화
        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = i + 1;
        }

        //길이가 큰 배열의 사용
        System.out.println(bigArr[2]);
        System.out.println("=======================");

        for (int j = 0; j <bigArr.length ; j++) {
            if(bigArr[j] % 3 == 0){
                System.out.println(bigArr[j]);
            }
        }

        System.out.println("=======================");
        //배열의 선언과 동시에 초기화
        //길이가 4 / 값이 10,20,30,40 인 배열
        int[] valueArr = { 10, 20, 30, 40, 50};

        //배열 사용
        System.out.println(valueArr[0]);
        System.out.println(valueArr[1]);
        System.out.println(valueArr[2]);
        System.out.println(valueArr[3]);

        System.out.println("=======================");
        //k < valieArr.length 에서 <= 을 하면 오류 발생 : length 의 -1 기억할 것. "=" 주의!
        for (int k = 0; k < valueArr.length; k++) {
            System.out.println(valueArr[k]);
        }
        System.out.println("=======================");





    }
}
