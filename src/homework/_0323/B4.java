package homework._0323;

public class B4 {
    /*
    4. 문자열 "145.987", "-563.11" 을 double형으로 변경하여
            덧셈의 결과를 출력하세요.
     */
    public static void main(String[] args) {
        // 문자열 "145.987"
        // 문자열 "-546.11"

        String str1 = "145.987";
        String str2 = "-546.11";

        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);

        // double형으로 변환된 것 확인하기
        System.out.println("str1: " + a + ", str2: " + b);

        //연산
        System.out.println(a + b);






    }


}
