package homework._03_0316;

import java.util.Random;
import java.util.Scanner;

public class _01basic {
    public static void main(String[] args) {

         /*
        1.int배열을 10개 생성해라.

        int배열에 3의 배수를 차례대로 저장해라.
        그리고 거꾸로 출력해라.

        2.int배열을 10개 생성해라
        사용자로부터 10개의 값을 입력받고
        순서대로 출력하고
        총합을 구하세요

        3.int 배열로 10개의 공간을 생성하라
        1 ~ 10까지의 임의의 수를 저장하고
        홀수만 골라서 출력하라

        4. 정수 10개를 입력받아 배열에 저장하고,
        이 정수중에서 2의 배수와 3의 배수를 출력하세요

         */


        //1
        int[] arr1 = new int[10];
        arr1[0] = 3;
        arr1[1] = 6;
        arr1[2] = 9;
        arr1[3] = 12;
        arr1[4] = 15;
        arr1[5] = 18;
        arr1[6] = 21;
        arr1[7] = 24;
        arr1[8] = 27;
        arr1[9] = 30;


        System.out.println(arr1[9]);
        System.out.println(arr1[8]);
        System.out.println(arr1[7]);
        System.out.println(arr1[6]);
        System.out.println(arr1[5]);
        System.out.println(arr1[4]);
        System.out.println(arr1[3]);
        System.out.println(arr1[2]);
        System.out.println(arr1[1]);
        System.out.println(arr1[0]);


       /*


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[10];
		int num = 1;
		int count = 0;

		while(true) {
			if(num % 3 == 0) {
				nums[count++] = num;
			}
			num++;

			if(count == 10) {
				break;
			}
		}

		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}



        */

        //2 int배열을 10개 생성해라 사용자로부터 10개의 값을 입력받고
        //순서대로 출력하고 총합을 구하세요

        int[] arr2 = new int[10];
        Scanner sc = new Scanner(System.in);
       //사용자가 입력할 곳

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("10개의 정수를 입력하세요: ");
            arr2[i] = sc.nextInt(); // 입력받은 정수 저장과정
        }

        int sum = 0;
        System.out.print("입력한 정수: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " "); // 하나씩 접근하면서 뺑이 돌림
            sum += arr2[i]; // 모든 수 더하기
        }
        System.out.printf("%n총합: %d%n", sum);


        //3. 3.int 배열로 10개의 공간을 생성하라
        //        1 ~ 10까지의 임의의 수를 저장하고
        //        홀수만 골라서 출력하라

        int[] arr3 = new int[10];
        Random random = new Random(); // 임의의 수니까 랜덤돌리기 가동

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = random.nextInt(10) + 1;
        } // 배열에 1~10까지 랜덤수 저장

        System.out.print("홀수는: ");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 1) {                  // 2 나눠서 안떨어지면 넌 홀수다 라는 의미.
                System.out.print(arr3[i] + " ");
            }
        }
        System.out.println();







    }









    }
