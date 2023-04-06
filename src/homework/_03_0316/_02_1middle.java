package homework._03_0316;

import java.util.Random;

public class _02_1middle {
    /*

    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[20];

		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 101);

		}

		for(int j = 0; j < nums.length; j++) {
			if(j % 2 == 1) {
				System.out.println(nums[j]);
			} else {
				System.out.println(nums[nums.length - 2 - j]);
			}
		}
	}




     */
    public static void main(String[] args) {
//        1. 20개 배열을 선언하세요
//        20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//        먼저 인덱스의 홀수번째는 앞에서부터 출력하고
//        짝수번째는 뒤에서부터 출력하세요


        int[] arr = new int[20];
        Random random = new Random();


        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(101);
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("===========");

        System.out.println("홀수");

        for (int i = 1; i < arr.length; i+= 2) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("짝수");

        for (int i = arr.length -1; i >=0 ; i-= 2) {
            System.out.print(arr[i]);
        }

    }
}
