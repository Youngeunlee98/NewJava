package homework._0320;


    /*

    1. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
  static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
  static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환

2. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴



     */
        public class ArrayUtility {


            public static double[] intToDouble(int[] source) {
                double[] result = new double[source.length]; // 여기있는 아이들을 전부 더블로 바꿀수있게끔  source.length 사용

                for (int i = 0; i < source.length; i++) {
                    result[i] = (double) source[i];    //double 안써도 자동 형변환 됨
                }
                return result;
            }

            public static int[] doubleToInt(double[] source) {
                int[] result = new int[source.length];
                for (int i = 0; i < source.length; i++) {
                    result[i] = (int) source[i]; // 강제형변환해야함
                }
                return result;
            }
        }


        /*
         static int[] doubleToInt(double[] source){
        int[] arr = new int[source.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(Math.round(source[i])));

        }
        return arr;
    }

         */





