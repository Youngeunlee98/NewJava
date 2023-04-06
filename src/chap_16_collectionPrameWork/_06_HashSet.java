package chap_16_collectionPrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_HashSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<String>();
        //추상,인터페이스는 인스턴스화 불가.

        strSet.add("Java");
        strSet.add("Jdbc");
        strSet.add("JavaScript");
        strSet.add("Html/Css");
        //중복값 저장
        strSet.add("Jdbc");
        strSet.add("Java");
        strSet.add("React.js");

        System.out.println("strSet의 크기: " + strSet.size());

        int index = 0;
        //Iterator
        Iterator<String> it = strSet.iterator();
        while (it.hasNext()) {//다음요소가 있는지 없는지
            String str = it.next();
            System.out.println(index++ + " : " + str);
            if(str.equals("Html/Css")){
                System.out.println(index++ + " : " + str);
            }
        }

        //요소삭제
        strSet.remove("Jdbc");
        //사이즈 변화가 있는지
        System.out.println("strSet의 크기: " + strSet.size());

        //비워져있는지 아닌지
        strSet.clear();
        if(strSet.isEmpty()){
            System.out.println("strSet은 비워져 있습니다.");
        }else {
            System.out.println("strSet은 비워져 있지 않습니다.");
        }






    }
}
