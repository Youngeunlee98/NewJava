package homework._02_0315team;

import java.util.Scanner;

public class _0315_c {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		1. 돈의 액수를 입금하세요
//		   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//		   출력 개수는 단위가 큰 것 순서로 계산합니다
//		   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		System.out.println("문제1");
		System.out.print("돈의 액수를 입금하세요>>");

		//금액을 입력 받기
		int money = sc.nextInt();

		//입력 받은 금액을 지폐 단위로 나누게 되면 몫이 지폐의 수
		//나머지를 다음 단위의 지폐로 나눈 수의 몫이 그 다음 지폐의 수
		//몫을 구해 지폐의 수를 보여주고 나머지 값을 저장
		//저장한 나머지 값을 그 다음 지폐 단위로 나눠 몫을 구한다.
		//10원 단위가 될 때까지 몫을 구하고 마지막 나머지가 1원 단위.
		System.out.print("오만원권"+money/50000+"매, ");
		money %= 50000;
		System.out.print("만원권"+money/10000+"매, ");
		money %= 10000;
		System.out.print("오천원권"+money/5000+"매, ");
		money %= 5000;
		System.out.print("천원권"+money/1000+"매, ");
		money %= 1000;
		System.out.print("500원동전"+money/500+"개, ");
		money %= 500;
		System.out.print("100원동전"+money/100+"개, ");
		money %= 100;
		System.out.print("10원동전"+money/10+"개, ");
		money %= 10;
		System.out.println("1원동전"+money+"개");

//		int[] moneyArr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
//
//		for (int i = 0; i < moneyArr.length; i++) {
//			System.out.print(moneyArr[i] +"원 "+money/moneyArr[i]+"개, ");
//			money %= moneyArr[i];
//		}
//		System.out.println("1원 " + money +"개");



//		2. 369게임을 작성합니다.
//		   1~99까지의 정수를 입력받고
//		   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//		   2개가 있으면 "박수짝짝"을 출력하세요
//		   예를 들어 13은 "박수짝"
//		   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		System.out.println("문제2");
		System.out.print("1-99 입력 >>");
		int n2 = sc.nextInt();

		//입력 받은 수의 십의 자리 수 변수
		int ten;
		//입력 받은 수의 일의 자리 수 변수
		int one;

		//입력 받은 수 n2를 10으로 나눈 몫은 십의 자리 수
		ten = n2/10;
		//입력 받은 수 n2를 10으로 나눈 나머지는 일의 자리 수
		one = n2%10;

		//십의 자리 수에 3, 6, 9가 들어가는지
		if(ten==3 || ten==6 || ten==9) {
			//일의 자리 수에 3, 6, 9가 들어갈 경우
			if(one==3 || one==6 || one==9) {
				System.out.println("박수짝짝");
			}
			//십의 자리 수에만 3, 6, 9가 들어갈 경우
			else {
				System.out.println("박수짝");
			}
		}
		//일의 자리 수에만 3, 6, 9가 들어갈 경우
		else if(one==3 || one==6 || one==9){
			System.out.println("박수짝");
		}
		//3, 6, 9가 십의 자리 일의 자리 수 둘 다 없을 경우
		else {
			System.out.println("박수없음");
		}


//		3. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요.
		System.out.println("문제3");

		int a;	//A
		int b;	//B
		int result = 99;

		int ab;
		int ba;

		for(a=0; a<=9; a++) {
			for(b=0; b<=9; b++) {
				ab = a*10 + b;
				ba = b*10 * a;
				result = ab + ba;
				if(result == 99) {
					System.out.println(ab + "+" + ba + "=" + result);
				}
			}
		}
		
		
//		4. 다음과 같이 출력하세요.
//	    *
//	   ***
//	  *****
//	 *******
//	*********
		System.out.println("문제4");
		System.out.println("피라미드");
		int row = 5;
		for (int i=0; i<row; i++) {
		    for (int j=1; j<row-i; j++) {
		    	System.out.print(" ");
		    }
		    for (int j=0; j<i*2+1; j++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
	
	}
}
