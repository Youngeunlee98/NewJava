package chap_21_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_flatMap {
    public static void main(String[] args) {
        int[][] intArr = {{1,2},{2,3},{3,4}};

        Arrays.stream(intArr).flatMapToInt(Arrays ::stream)
                .map(num -> num).forEach(num -> System.out.println(num));

    }
}

