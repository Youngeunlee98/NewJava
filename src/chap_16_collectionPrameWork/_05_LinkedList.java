package chap_16_collectionPrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _05_LinkedList {
    public static void main(String[] args) {
        //ArrayList & LinkedList 속도 비교

        //순차적 데이터 넣기
        List<String> aList = new ArrayList<String>();
        List<String> bList = new LinkedList<String>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            aList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList에 순차적으로 데이터를 추가하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            bList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("LinkedList에 순차적으로 데이터를 추가하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");

        //contains 메소드 속도 비교
        System.out.println("-------contains속도 비교---------------");
        startTime = System.nanoTime();
        System.out.println(aList.contains("900000"));
        endTime = System.nanoTime();

        System.out.println("ArrayList에서 값 900000을 "+ "찾는 데 걸린시간 : " + (endTime - startTime) + "나노초입니다.");

        startTime = System.nanoTime();
        System.out.println(bList.contains("900000"));
        endTime = System.nanoTime();

        System.out.println("LinkedList에서 값 900000을 " + "찾는 데 걸린시간 : " + (endTime - startTime) + "나노초입니다.");


        //get(int index) 속도 비교
        System.out.println("--------------get 속도 비교-----------------");
        startTime = System.nanoTime();
        System.out.println(aList.get(8000));
        endTime = System.nanoTime();

        System.out.println("ArrayList에서 인덱스 80000에 접근하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");

        startTime = System.nanoTime();
        System.out.println(bList.get(8000));
        endTime = System.nanoTime();

        System.out.println("LinkedList에서 인덱스 80000에 접근하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");

        // 중간의 값
        System.out.println("-----------중간의 값 추가 시간 비교------------");
        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            aList.add(i,String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList에 중간의 데이터를 추가하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");
        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            bList.add(i,String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("LinkedList에 중간의 데이터를 추가하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");

        //인덱스 데이터 삭제 시간 비교
        System.out.println("----------데이터 삭제시간 비교------------");
        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            aList.remove(String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList에 중간의 데이터를 삭제하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");

        startTime = System.nanoTime();

        for (int i = 1000; i < 5000; i++) {
            bList.remove(String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("LinkedList에 중간의 데이터를 삭제하는데 걸리는 시간: " + (endTime - startTime) + "나노초입니다. ");






    }
}
