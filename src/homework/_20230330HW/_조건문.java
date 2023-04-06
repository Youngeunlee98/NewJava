package homework._20230330HW;

import java.util.Scanner;

public class _조건문 {
    /*
    1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.

2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.

3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세
     요."를 출력하세요.(switch~case~default 사용)

4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)

5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.

6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.

7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.

8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.

9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.

     */
    public static void main(String[] args) {
        //1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1: ");
        int num1 = sc.nextInt();
        System.out.println("정수 2: ");
        int num2 = sc.nextInt();

        System.out.println(Math.max(num1,num2));

        System.out.println("-----------------2---------------");

        //2.사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.

        System.out.println("정수 1: ");
        int num3 = sc.nextInt();

        if(num3 > 0) System.out.println("양수");
        if(num3 < 0) System.out.println("음수");

        System.out.println("-----------------3---------------");

        //3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고,
        // "Python"인 경우 "공부중인 언어입니다."를 출력하고,
        // 그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.
        // (switch~case~default 사용)

        System.out.println("문자열 입력: ");
        String str = sc.next();

        switch (str){
            case "Java":
                System.out.println("좋아하는 언어입니다.");
                break;
            case "Python":
                System.out.println("공부중인 언어입니다.");
                break;
            default:
                System.out.println("다른 언어를 공부해보세요.");
                break;
        }
        System.out.println("-----------------4---------------");
        //4.사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고
        // 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)

        System.out.println("숫자 입력: ");
        int num = sc.nextInt();

        switch (num%3){
            case 0:
                System.out.println("3의 배수입니다.");
                break;
            default:
                System.out.println("3의 배수가 아닙니다.");
        }
        System.out.println("-----------------5---------------");
        //5.사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고,
        // 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.

        System.out.println("숫자 입력: ");
        int number = sc.nextInt();
        if ((number % 2) == 0) {
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }
        System.out.println("-----------------6---------------");
        //6.사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
        System.out.println("정수 입력1: ");
        int number1 = sc.nextInt();
        System.out.println("정수 입력2: ");
        int number2 = sc.nextInt();
        System.out.println("정수 입력3: ");
        int number3 = sc.nextInt();
        System.out.println("정수 입력4: ");
        int number4 = sc.nextInt();
        System.out.println("정수 입력5: ");
        int number5 = sc.nextInt();

        int max = number1;
        if (number2 > max) max = number2;
        if (number3 > max) max = number3;
        if (number4 > max) max = number4;
        if (number5 > max) max = number5;

        System.out.println(max);
        System.out.println("-----------------7---------------");
        //사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고,
        // 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.

        System.out.println("문자열을 입력해주세요: ");
        String str2 = sc.next();

        if (str2.equals("Yes")) System.out.println("예");
        if (str2 == "No") System.out.println("아니오");
        else System.out.println("잘못 입력하셨습니다.");


        System.out.println("-----------------8---------------");
        //8.  사용자가 입력한 두 정수를 비교하여
        // 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다."
        // 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.

        System.out.println("정수 1: ");
        int input = sc.nextInt();
        System.out.println("정수 2: ");
        int input2 = sc.nextInt();

        if (input == input2) System.out.println(" 두 수가 같습니다.");
        if (input > input2) System.out.println("첫번째 수가 더 큽니다.");
        if (input < input2) System.out.println("두번째 수가 더 큽니다.");


        System.out.println("-----------------9---------------");
        //사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다."
        // 모두 홀수인 경우 "모두 홀수입니다."
        // 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.

        System.out.println("정수 1: ");
        int input3 = sc.nextInt();
        System.out.println("정수 2: ");
        int input4 = sc.nextInt();
        System.out.println("정수 3: ");
        int input5 = sc.nextInt();

        int oddNum = 0;
        int evenNum  = 0;

        if((input3 % 2) == 0 && (input4 % 2) == 0 &&(input5 % 2) == 0 ) {
            System.out.println(" 모두 짝수입니다.");
        }if((input3 % 2) == 1 && (input4 % 2) == 1 &&(input5 % 2) == 1 ){
            System.out.println("모두 홀수입니다.");
        }else if ((input3 % 2) == 0 || (input4 % 2) == 0 || (input5 % 2) ==0){
            oddNum++;
        }else if ((input3 % 2) == 1 || (input4 % 2) == 1 || (input5 % 2) == 1 ){
            evenNum++;
        }
        System.out.println("짝수: " + oddNum + "개, 홀수: " + evenNum + "개 입니다." );






    }
}
