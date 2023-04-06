package chap_15_usefulClass;

public class _09_absMaxMinRint {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = -456;

        //abs()
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2)); // 절대값구하기

        //max
        System.out.println(Math.max(num1, num2)); //최대
        System.out.println(Math.min(num1,num2));  //최소

        //rint
        double num3 = 123.456;
        System.out.println(Math.rint(num3)); //근사값

    }
}
