package homework.mmm;

public class ArrayUtility {
//    1. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
//    static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
//    static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환

    static double[] intToDouble(int[] source){
        double [] arr = new double[source.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = source[i];
        }
        return arr;
    }

    static int[] doubleToInt(double[] source){
        int[] arr = new int[source.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(Math.round(source[i])));

        }
        return arr;
    }



}
