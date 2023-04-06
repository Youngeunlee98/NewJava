package homework._0323;

public class M3 {
    /*
    3. 처음에 은행에 맡긴 돈은 10000원입니다
       금리는 연 10%입니다
       복리이자로 계산했을 때 10년후 얼마가 될까요?
     */
    public static void main(String[] args) {

        double firstMoney = 10000; // 처음에 은행에 맡긴 돈
        double rate = 0.1; // 금리 10%
        int year = 10; // 10년

        firstMoney = firstMoney + (firstMoney * rate);

        for (int i = 0; i < year ; i++) {
            firstMoney = firstMoney + (firstMoney * rate);
            System.out.println(i + "년 후 = " + firstMoney + "원");
        }





    }
}
