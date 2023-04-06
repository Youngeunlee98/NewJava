package homework._0327;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic {
    /*
    1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.

    2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고
    index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.

    3. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분)
    value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("정수를 5개 입력해주세요: "); // 정수 5개 입력하기
            num.add(sc.nextInt());
        }
        System.out.println("사용자가 입력한 값: " );
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }





    }
}
