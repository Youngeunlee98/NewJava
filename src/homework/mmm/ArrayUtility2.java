package homework.mmm;

public class ArrayUtility2 {
//    2. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
//    static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
//    static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
    static int[] concat(int[] s1, int[] s2){
        int[] arr = new int[s1.length + s2.length];

        for (int i = 0; i < s1.length; i++) {
            arr[i] = s1[i];
        }

        int index = 0;
        for (int i = s1.length; i < arr.length; i++) {
            arr[i] = s2[index++];
        }

        return arr;
    }

    static int[] remove(int[] s1, int[] s2){
        int[] arr = new int [s1.length];
        int index = 0;
        for (int i = 0; i < s1.length; i++) {
            if(i < s2.length){
                if(s1[i] != s2[i]){
                    arr[i] = s1[i];
                    index++;
                }
            }else {
                break;
            }

        }
        int[] result = new int [index];

        for(int i=0; i<index; i++){
            result[i] = arr[i];
        }

        return result;
    }	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
}
