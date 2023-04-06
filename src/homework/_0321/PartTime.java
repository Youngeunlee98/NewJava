package homework._0321;

public class PartTime extends Employee{
    //계약직 : workDay//근무일수?
    // 월급 = pay*workDay

    public int workDay; // 근무 일수
    public int pay; //


    @Override
    public double getMonthPay() {
        int result = pay * workDay;
        return result;
    }
}
