package chap_21_stream;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Stream;

public class _12_peek {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i <10 ; i++) {
            intList.add(i);
        }
        //1.  최종처리가 없이 잘못 작성한 peek
        //중간처리만 있어서 동작하지 않는다.
        intList.stream().filter(num -> num % 3== 0)
                .peek(num -> System.out.println(num));


        //2. peek의 최종처리가 있을때 정상작동
        intList.stream().filter(num -> num % 3== 0)
                .peek(num -> System.out.println(num))
                .mapToInt(num -> num).sum();

        //peek = stream을 리턴
//        Stream<Integer> newIntStream = intList.stream()
//                .peek(num -> Stream.of(num));
//        newIntStream.forEach(num -> System.out.println(num));


    }
}
