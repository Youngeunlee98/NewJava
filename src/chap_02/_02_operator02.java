package chap_02;

public class _02_operator02 {
    public static void main(String[] args) {
        //대입연산자
        int num = 10;
        num = 10 + 2; // num = num + 2 , 12
        System.out.println(num); //12

        num = num - 2 ;
        System.out.println(num); //10

        num = num * 2;
        System.out.println(num); //20

        num = num / 2;
        System.out.println(num); //10

        num = num % 2;
        System.out.println(num); // 0

        //복합 대입 연산자
        num = 10;
        num += 2; // num + 2; 랑 동일함.
        System.out.println(num); //12

        //num = num - 2;
        num -= 2;
        System.out.println(num); //10

        //num = num * 2;
        num *= 2;
        System.out.println(num); //20

        //num = num / 2;
        num /= 2;
        System.out.println(num); //10

        //num = num % 2;
        num %= 2;
        System.out.println(num); // 0
    }
}
