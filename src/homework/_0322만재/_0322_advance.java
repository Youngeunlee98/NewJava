package homework._0322만재;

import java.util.Arrays;

public class _0322_advance {
    public static void main(String[] args) {
        System.out.println("\n문제 1");
        String s1 = "adfdfmadADFNAUDF";
        String s2 = "123456789";
        String s3 = "123213123s";
        System.out.println(advance1(s1));

        System.out.println("\n문제 2");
        System.out.println(convertToInt(s2));
        System.out.println(convertToInt(s3));

        System.out.println("\n문제 3");
        String s4 = "abcdefABCDEZZ";
        System.out.println(advance3(s4, 1));
        System.out.println(advance3(s4, 2));
    }

//    1. 사용자가 입력한 문자열을 순서대로 정리하세요.
//        순서는 유니코드 값 오름차순으로 정리.
    public static String advance1(String str) {
        String reStr;
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        reStr = new String(charArr);
        return reStr;
    }

//        2. 사용자가 입력한 문자열(단, 숫자로만 구성돼야함)을
//        정수형으로 바꿔주는 메소드 int convertToInt(String str)
//        을 작성하세요. ex) "532" -> 532
    public static int advance2(String str) {
        return 0;
    }

    public static int convertToInt(String str) {
        int reNum = 0;
        try {
            reNum = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("숫자로만 구성되어 있지 않습니다.");
        }
        return reNum;
    }

//        3. 사용자가 영문자로만 구성된 문자열과 정수를 1개 입력합니다.
//        해당 문자열에서 알파벳 대문자는 입력된 정수만큼 증가,
//        알파벳 소문자는 입력된 정수만큼 감소된 새로운 문자열을 출력하세요.
//        a에서 1 감소하면 z로 Z에서 1 증가하면 A로 순환됩니다.
//        ex) OoOpGh, 2 -> QmQnIf 출력
    public static String advance3(String str, int n) {
        String reStr = "";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
                //대문자인 경우
            if(charArr[i] >= 65 && charArr[i] <= 90){ // 알파벳했던거 하듯이
                charArr[i] += n;
                if(charArr[i] > 90){
                    charArr[i] -= 26;
                }

            } else if (charArr[i] >= 97 && charArr[i] <= 122) {
                //소문자인 경우
                charArr[i] -= n;
                if(charArr[i] < 97){
                    charArr[i] +=26;
                }
            }

        }
        reStr = new String(charArr);

        return reStr;
    }

    /*
    //3



     */




}
