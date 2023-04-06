package chap_15_usefulClass;

import java.util.ArrayList;
import java.util.List;

public class _03_String02 {
    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "smartphone";
        String str3 = "abcadefekfg";

        // 포함여부
        if (str1.contains("tp")){
            System.out.println("tp를 포함합니다.");
        }else {
            System.out.println("tp를 포함하지 않습니다..");
        }

        //해당 문자의 인덱스
        int index = str2.indexOf('h');
        int index2 = str3.indexOf('a', 4);
        int index3 = str3.indexOf("abc");

        int index4 = str3.lastIndexOf('h');
        int index5 = str3.indexOf('a',7);

        //문자열의 길이
        int[] intArr = new int[10];
        System.out.println(intArr.length);

        System.out.println("str1의 길이는 " + str1.length() + " 입니다.");

        List<Integer>intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(1);
        intList.add(1);
        intList.add(1);
        System.out.println(intList.size());

        //replace, replaceAll(정규식 사용가능)
        String str4 = "abc" +"abca"+"bca"+"abc";



    }
}
