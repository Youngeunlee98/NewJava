package homework._01_0314;

public class _03_middle {
    public static void main(String[] args) {
        /*
        1. 삼항 조건 연산자를 이용하여 int age = 29; 일 경우
            20대입니다. 를 출력하고
            age가 30이상일 경우
            20대가 아닙니다.를 출력하세요.
        */
        int age = 30;
        String a = (age <= 29) ? "20대 입니다." : "20대가 아닙니다." ;
        System.out.println(a);


        System.out.println("============================");

        /*
        2. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
        2와 3의 공배수는 6의 배수?
            for(int i = 1; i <= 100; i++) {
	        if()  {
		            System.out.print(i + ", ");
	                } => if문의 조건만 완성
                }
         */

        for(int i = 1; i <= 100; i++){
            if(i % 6 == 0){
                System.out.println(i + ", ");
            }
        }





    }
}
