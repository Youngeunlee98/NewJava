package chap_06_class;

import chap_06_class.animal.Bird;

public class _05_manyBirds {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Bird bird3 = new Bird();
        Bird bird4 = new Bird();

        bird.name = "독수리";
        bird.wing = 2;
        bird.size = "크다";
        bird.color = "갈색";
        bird.food = "육식";

        bird.birdInfo("독수리","육식");
        bird.fly();
        bird.cry();
        bird.eat();
        bird.walk();


        System.out.println("---------2--------");

        Bird bird2 = new Bird();

        bird2.name = "참새";
        bird2.wing = 2;
        bird2.size = "작다";
        bird2.color = "노랑색";
        bird2.food = "채식";

        bird2.birdInfo("참새","채식");
        bird2.fly();
        bird2.cry();
        bird2.eat();
        bird2.walk();
    }


    }

