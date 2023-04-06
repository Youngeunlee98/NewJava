package homework._0323;

public class B3 {
    //3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx)
    public static void main(String[] args) {
        //3.16.459 -> 3.16

        double num = 3.16459;

        System.out.println(Math.round(num*100)/100.0);




    }
}
