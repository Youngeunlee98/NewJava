package homework._20230403;

public class _연산자 {
    public static void main(String[] args) {
//        1. public static void main(String[] args) {
//            	for(int i = 1; i <= 10; i++) {
//        		if() {
//        			// 3, 6 ,9
//        		} else if() {
//        			// 1, 4, 7, 10
//        		} else if() {
//        			// 2, 5, 8
//        		}
//        	}
//           }
//           위 코드처럼 1 ~ 10까지의 숫자를 3가지 조건으로 나눌 때 가장 적합한 조건으로 채워주세요.
        System.out.println("-------1번-------");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("1번째: "+i);  //3,6,9
            } else if (i ==1 || i == 4 || i == 7 || i == 10) {
                System.out.println("2번째: "+ i); // 1, 4, 7, 10
            } else {
                System.out.println("3번째: " + i);		// 2, 5, 8
            }
            }

            //2. 중첩 삼항 연산자를 이용해서 1 ~ 20까지의 숫자중 소수를 판별하여 소수면 "xx는 소수입니다."라고 출력하고
            // 소수가 아니면 4의 배수인지 판별하여
            //"xx는 4의 배수입니다."라고 출력하고
            // 4의 배수가 아니면 "xx는 4의 배수가 아닙니다."라고 출력하세요.
            System.out.println("------2번---------");


        for (int i = 1; i <= 20; i++) {
            String result = (i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13
                            || i == 17 || i == 19) ?
                   (i + "는 소수입니다.") : ( i % 4 == 0 ? (i + "는 4의 배수 입니다.") : (i + "는 4의 배수가 아닙니다."));

            System.out.println(result);
        }



        }
    }

