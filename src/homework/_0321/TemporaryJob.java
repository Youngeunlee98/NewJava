package homework._0321;

public class TemporaryJob extends Employee {
    //임시직 : hireYear, 월급 = pay/12;

    public int hireYear; //계약 년수
    public int pay; //연봉

    @Override
    public double getMonthPay() {
        int result = pay/12;
        return result;
        // return pay/12;
    }
}
