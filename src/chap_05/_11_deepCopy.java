package chap_05;

public class _11_deepCopy {
    public static void main(String[] args) {
        //1. clone메소드 이용 깊은 복사

        int[] arr1 = {1, 2, 3, 4, 5};

        int[] arr2 = arr1.clone();

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);  //false

        arr1[0] = 10;
        arr2[0] = 20;

        System.out.println(arr1[0]);  //10
        System.out.println(arr2[0]);  //20

        //깊은 복사는 값을 변경해도 서로에게 아무런 영향을 주지 않는다 .

        //2.system.arraycopy 이용한 깊은 복사
        int[] arr3 = new int[5];

        System.arraycopy(arr1, 2, arr3, 0, arr1.length - 2);

        for (int i : arr3) {
            System.out.println(i + ", ");
        }
        System.out.println();

        System.out.println(arr1);
        System.out.println(arr3);
        System.out.println(arr1==arr3);  //false

        arr1[1] = 13;
        arr3[1] = 33;

        System.out.println(arr1[1]);  //13
        System.out.println(arr3[1]);  //33

        /*
        System.arraycopy 메소드의 첫 번째 인자는 복사할 원본 배열
        두 번째 인자는 원본 배열에서 복사를 시작할 인덱스
        세 번째 인자는 복사될 새로운 배열
        네 번째 인자는 새로운 배열에서 복사를 시작할 인덱스
        마지막 인자는 복사할 요소의 개수

         */









    }
}
