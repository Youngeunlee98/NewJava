package homework._03_0316;

import java.util.Arrays;
import java.util.Random;

public class _02middle {
    public static void main(String[] args) {
      /*

      1. 20개 배열을 선언하세요
    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
    먼저 인덱스의 홀수번째는 앞에서부터 출력하고
    짝수번째는 뒤에서부터 출력하세요

2. 클래스 PhoneInfo
   String[] name = new String[100];
   String[] phoneNum = new String[100];

   int i = 0;

   public void insertPhoneInfo(String name, String number) {
	//이름과 번호를 배열에 저장
   }

   //모든 PhoneInfo 출력
   public void printAllPhoneInfo() {

   }

   //번호에 해당하는 이름과 번호 출력
    public void printPhoneInfo(int index) {

   }



       */

        //1. 20개 배열을 선언하세요
        //    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
        //    먼저 인덱스의 홀수번째는 앞에서부터 출력하고
        //    짝수번째는 뒤에서부터 출력하세요

        int[] arr = new int[20]; //20개 배열을 선언함
        Random random = new Random(); // 난수를 이용하려고 만듬

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101); //101이 되야 인덱스는 -1 이니까
        }
        System.out.println("-------난수 생성---------");
        System.out.println(Arrays.toString(arr)); // 이제 이친구가 랜덤으로 20개까지 1~100 난수를 만들어줌
        //Arrays.toString : 배열의 요소를 문자열로 반환해주는 메소드

        System.out.println("-------홀수번째는 앞에서부터--------");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("-----------홀수 끝----------");


        System.out.println("-------짝수번째는 앞에서부터--------");
        for (int i = arr.length -1; i >= 0; i -= 2) {
            System.out.println(arr[i] + "\t");
        }

        System.out.println("-----------짝수 끝----------");


    }

}

