package chap_05;

public class _10_shallowcopy {
    public static void main(String[] args) {
        int[] intArr1 = {1,2,3,4,5};

        //얕은복사
        int[] intArr2 = intArr1;

        System.out.println(intArr1);
        System.out.println(intArr2);
        System.out.println(intArr1 == intArr2);

        //값을 변경하면 각각의 배열에 서로 영향을 미친다. 왜? = 얕은 복사이기 때문에!
        intArr1[0] = 20;
        intArr2[4] = 30;

        System.out.println(intArr1[4]);
        System.out.println(intArr2[0]);
    }
}
