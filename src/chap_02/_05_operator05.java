package chap_02;

public class _05_operator05 {
    public static void main(String[] args) {
        //삼항 연산자
        //결과 = 조건 ? (참의 경우 결과값) : (거짓일 경우 결과값)
        //int, boolean, String 등 사용 가능!
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max); //5

        int min = (x < y) ? x : y;
        System.out.println(min); //3

        boolean b = (x == y) ? true : false;
        System.out.println(b); //false

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); //달라요


    }
}
