package chap_06_class.Car;

public class Car {
    //제조사(company), 모델(model), 색상(color), 가격(money)
    //이 4가지의 멤버변수만들기
    public String company;
    public String model;
    public String color;
    public int money;

    //기본생성자
    //매개변수가 없다.
    public Car(){
        //String은 null로 초기화되서 예외발생 확률 증가, ""로 해주는게 안
        System.out.println("-----기본 생성자 호출------");
    }


    //매개변수가 있는 생성자
    public Car(String company){
        this.company = company; //해당 변수 초기화 진행
        System.out.println("------메개변수 하나인 생성자 호출-----");
    }

    public  Car(String company, String model){
        this.company = company;
        this.model = model;
        System.out.println("------매개변수가 두개인 생성자 호출------");
    }

    //매개변수명은 어떤 멤버변수를 초기화할지 명확히 하기위해서 멤버변수명광 일치시킨다.
    public Car(String company, String model, String color){
        //생성되는 객체 자체를 가르키는 this키워드 사용!
        this.company = company;
        this.model = model;
        this.color = color;
        System.out.println("----매개변수 세개인 생성자 호출------");
    }


    public Car(String company, String model, String color, int money){
        this.company = company;
        this.model = model;
        this.color = color;
        this.money = money;
        System.out.println("----매개변수 세개인 생성자 호출------");
    }

    //void carInfo() -> 입력한 자동차 정보를 출력
    //제조사 : 현대
    //모델: 제네시스
    //색상: 검정
    //가격: 5000
    public void carInfo(){



    System.out.println("제조사는 " + company);
    System.out.println("차량 모델은 " + model);
    System.out.println("차량 색상은" + color);
    System.out.println("차량 구입 가격은 " + money);



    }
}
