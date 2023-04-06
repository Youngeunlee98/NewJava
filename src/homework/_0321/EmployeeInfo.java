package homework._0321;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee ep;


        //switch~case문에서 break; 시 switch~case만 종료되기
        //때문에 while문을 종료시킬 플래그
        boolean isExit = false;

        while (true) {
            System.out.println("1. 정규직 저장");
            System.out.println("2. 임시직 저장");
            System.out.println("3. 계약직 저장");
            System.out.println("4. 전체 정보 출력");
            System.out.println("5. 월급 계산 출력");
            System.out.println("6. 프로그램 종료");

            int userInput = sc.nextInt();

            switch(userInput) {
                case 1:
                    ep = new FullTime();
                    System.out.println("정규직 입니다.");
                    System.out.print("이름을 입력하세요. : ");
                    String name = sc.next();
                    sc.nextLine();

                    System.out.print("사번을 입력하세요. : ");
                    int employeeNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("급여를 입력하세요 : ");
                    int money = sc.nextInt();
                    break;
                case 2:
                    ep = new TemporaryJob();
                    System.out.println("임시직 입니다.");
                    System.out.print("이름을 입력하세요. : ");
                    String name2 = sc.next();
                    sc.nextLine();

                    System.out.print("사번을 입력하세요. : ");
                    int employeeNumber2 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("급여를 입력하세요 : ");
                    int money2 = sc.nextInt();
                    break;

                case 3:
                    ep = new PartTime();
                    System.out.println("계약직 입니다.");
                    System.out.print("이름을 입력하세요. : ");
                    String name3 = sc.next();
                    sc.nextLine();

                    System.out.print("사번을 입력하세요. : ");
                    int employeeNumber3 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("급여를 입력하세요 : ");
                    int money3 = sc.nextInt();
                    break;

                case 4:
                    System.out.println("전체 정보를 출력합니다. ");


                case 5:
                    System.out.println("월급을 계산하여 출력합니다. ");

                case 6:
                    System.out.println("정말 프로그램을 종료할까요? 종료: 0");
                    int n = sc.nextInt();
                    if(n == 0) {
                        isExit = true;
                        System.exit(0);
                        break;
                    }
                    }


            }

            // 전체 정보 출력할것

            // 각각 월급계산 한것들 정리.






        }
    }

