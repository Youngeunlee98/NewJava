package chap_99;

public class _04_mathRandom {
    public static void main(String[] args) {
        //1. 난수 발갱 첫번째 방식
        //Math.random()
        // 0 <= Math.random() < 1 사이의 난수

        System.out.println(Math.random());

        //2. 1부터 10 까지의 난수

        int rand = (int)(Math.random() * 10) + 1;
        System.out.println(rand);


        System.out.println("=========================");

        //3. 1 ~ 45
        int i = (int)(Math.random() * 45) + 1;
        System.out.println(i);

        System.out.println("=========================");


        //4. 200 ~ 300
        int j = (int)(Math.random() * 200) + 100;
        System.out.println(j);

    }
}
