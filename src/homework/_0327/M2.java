package homework._0327;

import java.util.HashMap;
import java.util.Map;

public class M2 {
    /*
    정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서
    Map<String, Integer>에 담은 후 출력하세요.
  ex) {"3" : 1({1, 2}), "4" : 1({1, 3}), "5" : 2({1, 4}, {2, 3})}
     */
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5}; // 정수 배열
        Map<String, Integer> map = new HashMap<>(); // 맵 대기

        for(int i = 0; i < arr1.length; i++) { // 첫번째 수 준비
            for(int j = i+1; j < arr1.length; j++) { // 두번째수 준비
                // 배열 -> 문자열로 변환시킬 준비
                int num = arr1[i] + arr1[j];
                String key = Integer.toString(num); // toString을 사용하여 배열을 문자열로 전환하기
                // 이제 개수 판별 준비
                if(map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1); // 맵에 키가 있으면 +1/ 아니면 1  -> 이미 합이 저장: 개수+1
                }
            }
        }

        System.out.println(map); // 결과 구하기
    }


    }

