package homework._0321;

public abstract class Employee {

    public int employeeNumber; // 사원번호
    public String name; // 이름
    public double money; // 급여


    public abstract double getMonthPay(); // 월급?


   public void showEmployeeInfo(){
       System.out.println("4. 전체 정보 확인하기");
   }




}
