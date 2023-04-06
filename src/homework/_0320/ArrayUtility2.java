package homework._0320;

public class ArrayUtility2 {
    /*
    2. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴

     */

    static int[] concat(int[] s1, int[] s2){
        int[] result = new int[s1.length + s2.length];

        int index = 0;

        for (int i = 0; i < s1.length; i++) {
            result[index] = s1[i];
            index++;
        }
        for (int i = 0; i < s2.length; i++) {
            result[index] = s2[i];
            index++;
        }
        return result;
    }








}
