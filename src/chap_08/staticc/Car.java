package chap_08.staticc;public class Car {
    public static String grade;
    public String company;
    public String model;
    public String color;
    public int price;

    //2. static 키워드로 클래스 메소드 선언
    public static void printCurrentGrade() {
        System.out.println("현재 등급은 " + grade +
                "입니다.");
    }

    public void carInfo() {
        System.out.println("제조사 : " + company +
                "\n모델 : " + model);
    }

}
