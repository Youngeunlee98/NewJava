package chap_21_stream;

import java.util.Arrays;

public class _14_mathMethod {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};

        //요소 개수 세기
        long cnt = Arrays.stream(intArr)
                .count();
        System.out.println("요소의 개수는? -> " + cnt);

        //첫번째 요소는?
        int first = Arrays.stream(intArr).findFirst().getAsInt();
        System.out.println("첫번째 요소는> -> " + first);

        //최대 최소 값은?
        int max = Arrays.stream(intArr).max().getAsInt();
        int min = Arrays.stream(intArr).min().getAsInt();
        System.out.println("요소의 최대값은? :" + max + ", 최소값은? : " + min);

        //합계와 평균
        int sum = Arrays.stream(intArr).sum();
        double avg = Arrays.stream(intArr).average().getAsDouble();
        System.out.println("합계 : " + sum + ", 평균 : " + avg);

    }
}
