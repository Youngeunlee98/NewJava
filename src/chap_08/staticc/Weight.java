package chap_08.staticc;

//무게 측정
public class Weight {
    public void twoWeightSum(){
        int a= 76;
        int b = 65;

        String sum = Add.add(a,b,"kg");
        System.out.println(sum);
        //sum = Add.add(a,b,"g");
    }
}
