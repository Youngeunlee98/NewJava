package chap_21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02_parallelStream {
    public static void main(String[] args) {


        List<Integer> intList =
                new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            intList.add(i);
           // System.out.println(intList.get(i) + ", ");
        }
        System.out.println();

        //병렬처리 스트림 얻기
        //여러개의 스레드 사용핵서 작업을 병렬 처리 0
        Stream<Integer> intStream = intList.parallelStream();

        intStream.forEach(num -> {
            System.out.println(num + " : " +
                    Thread.currentThread().getName());
        });


    }
}

