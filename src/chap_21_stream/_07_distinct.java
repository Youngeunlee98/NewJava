package chap_21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _07_distinct {
    public static void main(String[] args) {
        //Stream에서 중복된 요소들을 제거해준다.

        int[] intArr = {1,2,3,4,5,5,4,4,3};
        IntStream intStream = Arrays.stream(intArr);
        intStream.distinct().forEach(
                num -> System.out.println(num)
        );




    }
}
