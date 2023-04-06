package homework._02_0315;

public class _01_basic {
    public static void main(String[] args) {
        /*

        1. 10 ~ 1까지 거꾸로 while문으로 출력
        2. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
        3. 10 ~ 1까지 거꾸로 for문으로 출력
        4. 1 ~ 100까지 합을 while문으로 출력
        5. 1 ~ 100까지 합을 do ~ while문으로 출력
        6. 1 ~ 100까지 합을 for문으로 출력


         */

        //1번. 10 ~ 1까지 거꾸로 while문으로 출력

        int num = 10;

        while (true){
            System.out.println(num--);
            if (num<1){
                break;
            }
        }

        //2
        System.out.println("-----------2-------------");

        int num2 = 10;

        do {
            System.out.println(num2);
            num2--;

        } while(num2 >=1);

        //3
        System.out.println("-----------3-------------");


        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }

        //4
        System.out.println("-----------4------------");

        int i = 1;
        int sum = 0;

        while(i <= 100){
           sum += i;
            i++;
        } System.out.println(sum);



        //5  1 ~ 100까지 합을 do ~ while문으로 출력
        System.out.println("-----------5------------");

        int num4 = 1;
        int sum2 = 0;

        do {
            sum2 += num4;
            System.out.println(sum2);
            num4++;

        }while(num4 <= 100);
        System.out.println("총합은 " + sum2);


        //6  1 ~ 100까지 합을 for문으로 출력
        System.out.println("-----------6------------");
        int sum3 =0;
        for (int f = 1; f <= 100 ; f++) {
            sum3 += f;
        }System.out.println(sum3);



    }
}
