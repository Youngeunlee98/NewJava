package homework._0320;

public class Au1 extends ArrayUtility{
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3};
        double[] doubleArray = ArrayUtility.intToDouble(intArray);  //int -> double

        System.out.println();

        double[] doubleArray2 = {1.0, 2.1, 3.2, 4.3, 5.4};
        int[] intArray2 = ArrayUtility.doubleToInt(doubleArray2); //double -> int

        System.out.println();


    }


}
