package chap18_enum;

public class _01_withoutEunm {
    //public static final int JAN = 1;
    //.... 수기로 많이 만들수는 있지만 비효율적.
    // => 효율적인 방법 => enum 사용하기!
    public static final int JAN = 1;
    public static final int FEB = 2;
    public static final int MAR = 3;
    public static final int APR = 4;
    public static final int MAY = 5;
    public static final int JUN = 6;
    public static final int JUL = 7;
    public static final int AUG = 8;
    public static final int SEP = 9;
    public static final int OCT = 10;
    public static final int NOV = 11;
    public static final int DEC = 12;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(
                "January는 " + JAN +" 월입니다"
        );
    }


}
