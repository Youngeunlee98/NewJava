package homework.game;

import java.util.Scanner;

public class Lotto {
	Scanner sc = new Scanner(System.in);
	
	int [] com;
	int [] user;
	
	boolean isRegame = true;
	
	
	public void start() {
		while(isRegame) {
			System.out.println("로또게임 시작");
			randomNum();
			
			System.out.print("로또 번호 :");
			
			for(int i=0; i<com.length-1; i++) {
				System.out.print(com[i] + "\t");
			}
			int bonus = com[com.length-1];
			System.out.println("보너스 번호: " + bonus);
			
			getUserInput();
			
			int result = rankLotto(prizeLotto(com, user), 
					bonusLotto(bonus, user));

			if (result != 0){
				System.out.println(result + "등 입니다.");
			}else {
				System.out.println("꽝입니다.");
			}

			
			reGame();
		}
	}
	
	//로또번호 생성 메소드
	//1~45까지 7개의 난수(중복제거)
	//7번째 숫자는 보너스 번호
	public void randomNum() {
		int index = 0;
		com = new int[7];
		while(index < com.length) {
			int n = (int)(Math.random()*45)+1;
			if(checkDuplicate(com, n)) {
				continue;
			}else {
				com[index] = n;
				index++;
			}
		}
	} 
	
	
	//중복값 확인 메소드
	public boolean checkDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;

		for(int i:arr) {
			if(i == num) {
				isDuplicated = true;
			}
		}

		return isDuplicated;
	}
	
	//사용자값 입력 받는 메소드
	//사용자가 1~45까지 6개 숫자 선택(중복제거)
	public void getUserInput() {
		int index = 0;
		user = new int[7];
		
		while(index < 7) {
			System.out.print((index + 1) + "번째 로또 번호를 입력하세요>>");
			int n = sc.nextInt();
			if(n < 1 || n > 45) {
				System.out.println("수의 범위를 벗어났습니다.");
			}else if(checkDuplicate(user, n)){
				System.out.println("중복된 수 입니다.");
			} else {
				user[index] = n;
				index++;
			}

		}
	}
	
	
	//보너스 번호를 제외한 숫자 비교 메소드
	public int prizeLotto(int[] comArr, int[] userArr) {
		int prize = 0;
		
		for(int i=0; i<comArr.length-1; i++) {
			for(int j : userArr) {
				if(comArr[i] == j) {
					prize++;
					break;
				}
			}
		}	
		return prize;
	}
	
	//보너스 번호 비교 메소드
	public int bonusLotto(int bonusNum, int[] userArr) {
		int bonus = 0;
		for(int i: userArr) {
			if(bonusNum == i) {
				bonus++;
			}
		}
		return bonus;
	}
	//1등 : 보너스 번호를 제외한 6개의 숫자가 모두 같을 때3
	//2등 : 보너스 번호와 5개 번호가 일치할 때
	//3등 : 보너스 번호를 제외한 5개의 숫자가 일치할 때
	//4등 : 보너스 번호를 제외한 4개의 숫자가 일치할 때
	//5등 : 보너스 번호를 제외한 3개의 숫자가 일치할 때
	//나머지는 꽝
	
	//등수 확인 메소드
	//몇 등인지 출력
	public int rankLotto(int prize, int bonus) {
		int rankNum = 0;
		
		if(prize == 6) {
			rankNum = 1;
		}else if(prize == 5) {
			if(bonus == 1) {
				rankNum = 2;
			}else {
				rankNum = 3; 
			}
		}else if(prize == 4) {
			rankNum = 4;
		}else if(prize == 3) {
			rankNum = 5;
		}
		
		return rankNum;
	}
	
	//재게임 여부
	public boolean reGame() {
		isRegame = true;
		
		System.out.print("다시하려면 1, 끝내려면 0 >>");
		int n = sc.nextInt();
		
		if(n == 1) {
			isRegame = true;
		}else if(n == 0) {
			isRegame = false;
		}
		//1, 0 이외의 수를 입력시 다시 reGame함수를 실행에 다시 입력 받기
		else {
			reGame();
		}
		
		return isRegame;
	}
}
