package homework._20230404;

import java.util.function.BiFunction;

public class HW_lambda {
    /*
    1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.

    2. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.

    3. 2번 문제에서 두 개를 합치는 메소드 appendSb와 역순으로 변경하는 메소드 reverseSb를 각각 선언하고 StringBuilder의 메소드를 참조하여 각각 구현하세요.

    4. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고
     maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.

     */
    public static void main(String[] args) {
        int intArr[] = {1, 2, 3,4,5,6,7, 8, 9, 10};

        printEvenNum((arr) -> {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
            }
        }, intArr);
    }

    public static void printEvenNum(IntArr iAr, int[] arr) {
        iAr.intArr(arr);
    }


}

@FunctionalInterface
interface IntArr{
    void intArr(int[] arr);
}

//2. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후
// 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
class lambda02{
    public static void main(String[] args) {

        StringFunc combineStrBuilder = (sb1, sb2) -> {
            sb1.append(sb2);
            return sb1.reverse().toString();
        };

        StringBuilder sb1 = new StringBuilder("hi");
        StringBuilder sb2 = new StringBuilder("everyone");
        String result = combineStrBuilder.apply(sb1, sb2);
        System.out.println(result);
    }

}
interface StringFunc {
    String apply(StringBuilder sb1, StringBuilder sb2);
}

//3. 2번 문제에서 두 개를 합치는 메소드 appendSb와
// 역순으로 변경하는 메소드 reverseSb를 각각 선언하고
// StringBuilder의 메소드를 참조하여 각각 구현하세요.

class lambda03{
    public static void main(String[] args) {

        BiFunction<StringBuilder, StringBuilder, String> combineStrBuilder = (sb1, sb2) -> {
            appendSb(sb1, sb2);
            reverseSb(sb1);
            return sb1.toString();
        };

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("world!");
        String result = combineStrBuilder.apply(sb1, sb2);

        System.out.println(result); // => !dlrow ,olleH
    }

    public static void appendSb(StringBuilder sb1, StringBuilder sb2) {
        sb1.append(sb2);
    }

    public static void reverseSb(StringBuilder sb) {
        sb.reverse();
    }
    }


