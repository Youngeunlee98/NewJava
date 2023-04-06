package homework._0321;

public class FullTime extends Employee{
    //정규직 : bonus, 월급 = pay/12+bonus/12
    public int bonus;
    public int pay;

    @Override
    public double getMonthPay() {
        int result = ((pay * 12) + (bonus)) / 12;
        return result;
    }
}
