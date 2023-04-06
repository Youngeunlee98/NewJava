package homework._20230403;

import java.util.Scanner;

public class _조건문 {
    //1. 사용자가 입력한 문자열의 길이가 20이상이면 해당 문자열을 거꾸로 출력하고
    //     20미만이면 문자열에 n, a, v, e, r 다섯개의 문자를 순서대로 추가하여
    //     문자열의 길이가 20이 되면 그 때 문자열을 출력하세요.
    public static void main(String[] args) {

        //이거 모르겠ㄴ

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuffer sb = new StringBuffer(input); // stringbuffer로 받기

        //선생님 풀이
//        if(input.length() >= 20){
//            StringBuilder sbb = new StringBuilder(input);
//            System.out.println(sbb.reverse());
//        }else {
//            int toTwenty = 20 - input.length();
//            char[] chArr = {'n', 'a', 'v', 'e', 'r'};
//
//            int cnt = 0;
//            for (int i = 0; i <toTwenty ; i++) {
//                if(i<5){
//                    input = input.concat(String.valueOf(chArr[i]));
//                }else {
//                    if (i % 5 == 0){
//                        cnt++;
//                    }
//                    input = input.concat(String.valueOf(chArr[i - (5*cnt)]));
//                }
//            }
//            System.out.println(input);
//        }

        if (sb.length() >= 20){
            sb.append(input).reverse();
        }if(sb.length() < 20){
            char[] arr = {'n', 'a', 'v', 'e', 'r'};
            int arrIndex = 0;
            int n = 20 - input.length();
            for (int i = 0; i < n; i++) {
                sb.append(arr[arrIndex++]);
                if(arrIndex == arr.length) {
                    arrIndex = 0;
                }
            }
            System.out.println(sb.toString());
        }




    }
}
