package chap_16_collectionPrameWork;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        //데이터 추가
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(5);
        list1.add(4);

        //sublist : 지정한 인덱스 사이의 데이터를 잘라옴
        list2 = new ArrayList(list1.subList(2,5));
        //print() 매개변수로 객체를 넣게되면 자동으로 toString메소드가 실행된 결과가 출력.
        System.out.println(list1); // = (list1.toString)
        System.out.println(list2);
        System.out.println("==============");

        //정렬
        Collections.sort(list2);
        Collections.sort(list1);


        if (list1.containsAll(list2)){
            System.out.println("list1이 list2를 포함함.");
        }else {
            System.out.println("list1이 list2를 포함하지 않음.");
        }
        System.out.println("===============");

        //list2 데이터 추가
        list2.add("collection");
        list2.add("framework");
        System.out.println(list2);

        list2.set(3, "ArrayList");
        System.out.println(list2);

        list2.set(3, "List");
        System.out.println(list2);
        System.out.println("-------------------");

        //list1에 list2의 데이터만 남기고 나머지는 삭제
        list1.retainAll(list2);
        System.out.println(list1);

        //ArrayList의 복제
        ArrayList list3 = (ArrayList)list2.clone();

        System.out.println(list2 == list3); //false
        System.out.println(list2.equals(list3)); //true
        System.out.println("-------------------");

        ArrayList list4 = new ArrayList();

        list4.add(10);

        //capacity를 확인하는 방법이 없다.....
        System.out.println(list4.size());
        //System.out.println(list4.toArray().);
        list4.trimToSize();

        String[] strArr = new String[list2.size()];

        //type을 지정 안했을 때 문제점
        //타입을 지정안하면 형변환시 castException이 발생할 수 도 있다.
        // 반드시 Type을 지정하고, 공통된 데이터 타입만 다룰 수 있도록 한다.
        for (int i = 0; i < list2.size() ; i++) {
            String str = new String(list2.get(i).toString());
            //String str = (String)list2.get(i)
            // strArr[i] = str;
        }













    }
}
