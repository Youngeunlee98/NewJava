package homework._0320;

import homework._0320.animals.Animalss;

public class Cat {
    //고양이
    public static void main(String[] args) {


        Animalss cat = new Animalss();
        cat.food = "육식";
        cat.leg = 4;
        cat.name = "고양이";
        cat.size = "Small";

        cat.animalInfo("고양이", "육식", 4, "Small");


    }
}
