package chap18_enum;

import chap18_enum.eunms.RGB;

public class _04_RGBEnum {
    public static void main(String[] args) {

        RGB red = RGB.Red;
        RGB blue = RGB.Blue;
        RGB green = RGB.Green;

        System.out.println(red.name() + ", " + green.name() + ", " + blue.name());
        System.out.println(red.getColor()+ ": " + red.getC1()+ "," + red.getC2() + "," +red.getC3());
        System.out.println(green.getColor() + ": " + green.getC1() + "," + green.getC2() + ","
                                                        + green.getC3());
        System.out.println(blue.getColor() + ": " + blue.getC1() + "," + blue.getC2() + "," + blue.getC3());

    }
}
