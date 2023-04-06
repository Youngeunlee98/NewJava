package chap_16_collectionPrameWork;


import employee.ContractEmployee;

import employee.Employee;
import employee.RegularEmployee;
import employee.TempEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_arrayListEx01 {
    public static void main(String[] args) {
        //ArrayList<Employee> 생성
        //사용자가 1. 정규직 2.계약직 3.임시직
        //각각 직원의 정보 입력
        //그 정보가 ArrayList에 저장
        //출력까쥐

        ArrayList<Employee> Employee = new ArrayList<Employee>(); //Employee를 담을수있는 ArrayList 만듬.

        Employee[] ep = new Employee[100];
        Scanner sc = new Scanner(System.in);

        int eno = 0;
        String name = "";
        int pay = 0;
        int bonus = 0;
        int hireYear = 0;
        int workDay = 0;

        while(true) {
            System.out.println("*** 메뉴 선택 ***");
            System.out.println("1. 정규직 저장");
            System.out.println("2. 임시직 저장");
            System.out.println("3. 계약직 저장");
            System.out.println("4. 전체 정보 출력");
            System.out.println("5. 월급 계산 출력");
            System.out.println("6. 프로그램 종료");

            int input = sc.nextInt();

            switch(input) {
                case 1 :
                    System.out.print("사번을 입력하세요.");
                    eno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("이름을 입력하세요.");
                    name = sc.next();
                    sc.nextLine();
                    System.out.println("급여를 입력하세요.");
                    pay = sc.nextInt();
                    System.out.println("보너스를 입력하세요.");
                    bonus = sc.nextInt();
                    Employee.add(new RegularEmployee(eno, name, pay, bonus));
                    Employee.get(Employee.size() -1).showEmployeeInfo();
                    System.out.println("----------------");
                    break;
                case 2 :
                    System.out.print("사번을 입력하세요.");
                    eno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("이름을 입력하세요.");
                    name = sc.next();
                    sc.nextLine();
                    System.out.println("급여를 입력하세요.");
                    pay = sc.nextInt();
                    System.out.println("근무년수를 입력하세요.");
                    hireYear = sc.nextInt();
                    Employee.add(new TempEmployee(eno, name, pay, hireYear));
                    Employee.get(Employee.size() -1).showEmployeeInfo();
                    System.out.println("----------------");
                    break;
                case 3 :
                    System.out.print("사번을 입력하세요.");
                    eno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("이름을 입력하세요.");
                    name = sc.next();
                    sc.nextLine();
                    System.out.println("급여를 입력하세요.");
                    pay = sc.nextInt();
                    System.out.println("근무일수를 입력하세요.");
                    workDay = sc.nextInt();
                    Employee.add(new ContractEmployee(eno, name, pay, hireYear));
                    Employee.get(Employee.size() -1).showEmployeeInfo();
                    System.out.println("----------------");
                    break;
                case 4 :
                    for(int i = 0; i < Employee.size(); i++) {
                       Employee.get(i).showEmployeeInfo();
                            System.out.println("----------------");
                        }

                    break;
                case 5 :
                    System.out.print("검색할 사원의 사번을 입력하세요.");
                    eno = sc.nextInt();
                    for (int i = 0; i < Employee.size(); i++) {
                        if(Employee.get(i).getEno() == eno) {
                            Employee.get(i).showEmployeeInfo();
                        }
                    }
                   break;
                case 6 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default :
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
            }
        }





    }
}

