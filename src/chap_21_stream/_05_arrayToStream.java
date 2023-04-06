package chap_21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_arrayToStream {
    public static void main(String[] args) {

        int[] intArr = new int[10];

        for (int i = 0; i < 10 ; i++) {
            intArr[i] = (int) (Math.random() * 10) + 1;
        }                      // == IntStream.of(intArr);
        IntStream intStream = Arrays.stream(intArr);

        //값이 5이상인 것들만 스트림으로 생성

        IntStream fiveStream = intStream.filter(a -> a>=5);

        //5이상 스트림에서 *4 한 새로운 스트림 만들기

        fiveStream.map(a -> a * 4)
                .forEach(a -> System.out.println("*4 : "+a));
    }
}
