package chap_21_stream;

import java.util.ArrayList;
import java.util.List;

public class _11_sorted {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            intList.add(i);
        }
        //오름차순 정방향으로 정렬하기
        //역순 내림차순 -> sorted(Comparator.reverseOrder())
        intList.stream().sorted().forEach(num ->
                System.out.println(num));




    }
}
