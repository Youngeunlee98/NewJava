package homework.game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	//게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고 
	//        사용자가 3개의 숫자를 입력(중복불가능)
	//		  컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를
	//        비교하는 데 숫자만 같으면 볼로 판정
	//        숫자와 위치까지 모두 같으면 스트라이크로 판정
	//        몇 스트라이크 몇 볼인지 출력
	//        3 스트라이크시 몇 회만에 맞췄는지 출력하고 게임종료
	//        다시 게임 진행할 지 물어보고(1: 리스타트, 0: 종료)
	//스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;
	
	//몇 번 맞췄는지 세어줄 변수
	private int gameCnt = 0;
	
	//컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];
	
	//사용자 입력값 저장할 배열
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	//게임 시작 메소드
	public void start() {
		while(true) {
			System.out.println("게임시작");
			
			//컴퓨터의 랜덤 수 3개 생성하는 함수
			generateRandom();
			
			//게임 시작될 때 횟수 초기화
			gameCnt = 0;
			
			//컴퓨터 배열 확인
			System.out.println(com[0] + ", " 
					+ com[1] + ", " + com[2]);

			//본 게임 시작(while문)
			while(true) {

				strike = 0;
				ball = 0;
				
				//사용자 입력값 확인하고 배열에 넣는 함수
				getUserInput();
				
				//사용자 입력값 확인
				System.out.println(user[0] + ", "
						+ user[1] + ", " + user[2]);
				
				//스트라이크 볼 개수 구하기
				strike = chkStrike(com, user);
				ball = chkBall(com, user) - strike;
				
				//결과 보여주기
				result(strike, ball);
				
				//한 번 입력 받았으니 게임 횟수 증가
				gameCnt++;
				
				//3스트라일 경우 몇 회만에 맞췄는 지 알려주면서 바깥 while문으로 나가기
				if(strike == 3) {
					System.out.println(gameCnt + "회 맞췄습니다.");
					break;
				} 
				//3스트라이크가 아닌 모든 경우에는 다시 사용자값 입력받기
				else {
					continue;
				}
			}//내부 while문 마지막(3스트라이크가 될 때까지 계속 반복)
			
			//3스트라이크인 경우 내부 while문에서 나와 여기로 온다.
			//게임을 다시 진행할 지 확인하는 함수 실행
			if(reGame()) {
				continue;
			} else {
				break;
			}
		}
	}
	
	//컴퓨터 랜덤 값 3개 생성해주는 메소드
	public void generateRandom() {
		int index = 0;
		
		//배열에 세 개가 다 들어갈 때가지 반복하기
		while(index <= 2) {
			int randomNum = rd.nextInt(10);
			//중복체크
			if(checkDuplicate(com, randomNum)) {
				continue;
			}else {
				com[index] = randomNum;
				index++;
			}
		}
		
	}
	
	//중복값 체크 메소드
	//arr은 비교할 배열
	//num은 배열에 넣을 숫자
	public boolean checkDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;
		
		for(int i : arr) {
			if(i == num) {
				isDuplicated =  true;
			}
		}
		return isDuplicated;
	}
	
	//유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		//입력 값 받기
		int index = 0;
		
		//입력값을 받을 때마 배열 비우기
		user = new int[3];
		
		while(index <= 2) {
			System.out.print("유저의 입력 값>>");
			int userNum = sc.nextInt();
			//중복체크
			if(checkDuplicate(user, userNum)) {
				continue;
			}else {
				user[index] = userNum;
				index++;
			}
		}
		
	}
	
	//스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		return false;
	}
	
	//스트라이크 개수 세기
	public int chkStrike(int[] com, int[] user) {
		int cnt = 0;
		
		//같은 자리에 같은 수가 있다면 cnt 증가
		for(int i=0; i<3; i++) {
			if(com[i] == user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//볼 개수 세기
	public int chkBall(int[] com, int[] user) {
		int cnt = 0;
		
		//같은 수가 있을 경우 증가
		for(int i:com) {
			for(int j:user) {
				if(i == j) {
					cnt++;
					break;
				}
			}
		}
		return cnt;
	}
	
	//스트라이크 수와 볼의 수를 매개변수로 받아 결과 출력
	public void result(int strike, int ball) {
		System.out.println("스트라이크 " + strike + "개 볼 " + ball + "개");
	}
	
	
	//재게임 여부
	public boolean reGame() {
		System.out.print("다시하려면 1, 끝내려면 0 >>");
		int re = sc.nextInt();
		
		
		if(re == 1) {
			return true;
		}else if(re == 0) {
			return false;
		}
		//1, 0 이외의 수를 입력시 다시 reGame함수를 실행에 다시 입력 받기
		else {
			reGame();
		}
		
		//지울 경우 오류 생기는데 왜 생기는 지 몰라요.
		return false;
	}
	
	
}
