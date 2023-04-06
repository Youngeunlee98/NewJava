package chap_06_class.animal;

public class Bird {
    //날개(int wing)
    //색깔(String color)
    //새이름(String name)
    //크기(int size)
    //식습관(String food)

    //날다(Void fly)
    //독수리는 날개를 이용하여 하늘을 납니다.
    //운다(Void cry)
    //독수리는 나무에 앉아 웁니다.
    //걷는다(Void walk)
    //독수리는 땅을 걷는다.
    //먹이를 먹는다(Void eat)
    //독수리는 고기를 먹는다.
    public int wing;
    public String color;
    public String name;
    public  String size;
    public String food;

    public void birdInfo(String name, String food){
        //System.out.println("새의 이름: " + name );
        //System.out.println("새의 색깔: " + color);
        //System.out.println("새의 날개 수: " + wing);
        //System.out.println("새의 크기: " + size);
        //System.out.println("새가 먹느 음식의 종류: " + food);
        System.out.println("새의 이름은 " + name + "이고 이 새의 식성은 " + food + "입니다.");
    }
    public void fly(){
        System.out.println( name + "는 " + wing + "개의 날개를 이용하여 하늘을 납니다.");
    }

    public void cry(){
        System.out.println(name + "은 나무에 앉아 웁니다.");
    }

    public void walk(){
        System.out.println(name + "은 땅을 걷습니다.");
    }

    public void eat(){
        System.out.println(name + "은 " + food + "을 합니다.");
    }


}
