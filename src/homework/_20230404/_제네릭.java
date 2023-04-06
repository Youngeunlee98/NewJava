package homework._20230404;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _제네릭 {
    /*
    1. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
    매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 100을 넘는 Entry만 List에 저장합니다.

    2. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을
    구현하세요.(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개
     */


    //Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요
    public static List<Map.Entry<Integer, Integer>>getOverHundr(Map<Integer, Integer>map){
        List<Map.Entry<Integer,Integer>> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (key * value > 100) { // 100을 넘는 Entry만 List에 저장
                result.add(entry);
            }
        }

        return result;
    }


    //매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 100을 넘는 Entry만 List에 저장합니다.
    public static void main(String[] args) {

    }
}
