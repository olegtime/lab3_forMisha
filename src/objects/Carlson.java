package objects;

import enums.Intensity;
import interfaces.TakeTheFood;

public class Carlson extends Person implements TakeTheFood {
    public Carlson(String name){
        super(name);
    }

    @Override
    public void takeTheFood(Food food){
        System.out.println(getName() + " " + Intensity.QUICKLY.getTranslate() + " наложил себе полную тарелку " + food.getName());
    }

    public void startBuildingACastle(Structure structure1, Structure structure2){
        System.out.print(getName() + " начал строить " + structure1.getName() + " из " + structure1.getMaterial());
        System.out.println(", а вокруг " + structure1.getName() + " " + structure2.getName() + ", заполненный " + structure2.getMaterial());
    }
}
