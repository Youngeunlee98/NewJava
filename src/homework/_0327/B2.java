package homework._0327;

import java.util.LinkedList;
import java.util.Scanner;

public class B2 {
    /*
    2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고
    index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>(); // 생성

        for (int i = 0; i < 5 ; i++) {
            System.out.println("정수를 5개 입력해주세요: "); // 정수 5개 입력하기
            list.add(sc.nextInt());
        }
        System.out.println("사용자가 입력한 값: " ); // 저장 & 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(" index가 3,4 번째인 요소의 값을 100,200 으로 변경후 출력: ");
        list.set(3,100);
        list.set(4,200);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }





    }
}
