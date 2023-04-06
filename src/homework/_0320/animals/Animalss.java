package homework._0320.animals;

public class Animalss {
    public int leg;
    public String color;
    public String name;
    public  String size;
    public String food;

    public void animalInfo(String name, String food, int leg, String size){
        System.out.println("동물의 이름: " + name );
        System.out.println("동물의 다리 수: " + leg);
        System.out.println("동물의 크기: " + size);
        System.out.println("동물이 먹는 음식의 종류: " + food);
        System.out.println("동물의 이름은 " + name + "이고 이 동물의 식성은 " + food + "입니다.");
    }
    public void walk(){
        System.out.println( name + "는 " + leg + "개의 다리를 이용하여 걸어다닙니다.");
    }
    public void eat(){
        System.out.println(name + "는 " + food + "을 합니다.");
    }



    /*
    package chap98_homework.nc230320.mammal;

public class Mammal {
	String race;

	Mammal() {
		System.out.println(race + "는(은) 포유류과입니다.");
	}

	Mammal(String race) {
		this.race = race;
		System.out.println(race + "는(은) 포유류과입니다.");
	}

	public void calve() {
		System.out.println(race + "는(은) 새끼를 낳습니다.");
	}
}

     */
}
