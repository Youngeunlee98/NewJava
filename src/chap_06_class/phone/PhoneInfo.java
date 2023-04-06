package chap_06_class.phone;

import java.util.Scanner;

public class PhoneInfo {

    public static String[] name = new String[100];
    public static String[] phoneNum = new String[100];

    //이름 100 개와 전화번호 100개를 담을 수 있는 배열 2개
    //String[] name = new String[100];
    //int[] phoneNum = new  int[100];
    Scanner sc = new Scanner(System.in);

    //배열의 현재 인덱스를 담고 있을 변수
    static int index = 0;

    //전달받은 이름과 전화번호 저장하는 메소드
    //insertPhoneNum
    public static void insertPhoneNum(String name, String number) {
        //이름과 번호를 배열에 저장


        //this.name[index] = name;
        //this.phoneNum[index] = number;
        //index++;

    }

    //저장된 모든 이름과 전화번호를 출력하는 메소드
    //printAllPhoneNum
    //이름: 홍길동, 전화번호: 1111111111
    //이름: 홍길동2, 전화번호: 2222222222
    //이름: 홍길동3, 전화번호: 3333333333
    //이름: 홍길동4, 전화번호: 4444444444

    public static void printAllPhoneNum(){
        for (int i = 0; i < index; i++) {
            System.out.println("이름: " + name[i] + ", " + "전화번호: " + phoneNum[i]);
        }

    }





    /*public void printAllPhoneNum() {
        for (int i = 0; i < name.length; i++) {
            int input = sc.nextInt();
            if (name[index] != null) {
                if (input == 1) {
                    System.out.println("계속합니다.");
                    System.out.println("이름: " + name[i] + ", " + "전화번호: " + phoneNum[i]);
                    continue;
                } else {
                    System.out.println("종료합니다.");
                    break;
                }
            }
        }
    }*/

        //전달받은 번호의 해당하는 이름과 번호를 출력하는 메소드
        //printPhoneNum
        ////이름: 홍길동4, 전화번호: 4444444444
        public static void printPhoneNum(int index) {
            if (name[index - 1] != null) {
                System.out.println("이름: " + name[index - 1] + ", " + "전화번호: " + phoneNum[index - 1]);
            } else {
                System.out.println("해당하는 이름과 전화번호를 찾을 수 없습니다.");
            }
        }



}