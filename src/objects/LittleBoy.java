package objects;

import enums.Duration;
import interfaces.TakeTheFood;
import interfaces.TasteTheFood;

public class LittleBoy extends Person implements TakeTheFood, TasteTheFood {

    private Eyes eyes = new Eyes();
    private Mouth mouth = new Mouth();
    public LittleBoy(String name){
        super(name);
    }

    @Override
    public void takeTheFood(Food food){
        System.out.println(getName() + " взял совсем капельку");
    }

    public void scared(Global global, Duration duration){
        System.out.println(getName() + " " + duration.getTranslate() + " с опаской относился к " + global.getName());
    }

    public void ate(Food food, Duration duration){
        System.out.println(getName() + " " + duration.getTranslate() + " ел такой " + food.getName());
    }

    @Override
    public void tasteTheFood(){
        System.out.println(getName() + " осторожно попробовал кусочек");
    }

    public void sayOops(){
        System.out.println("Ой!");
    }

    public void suffocate(){
        System.out.println(getName() + " задохнулся");
    }

    public void cry(){
        eyes.cry();
    }

    public void feelHot(){
        mouth.burn();
    }

    public void keepSilence(){
        System.out.println(getName() + " глотнул воздух и молчал");
    }

    private class Eyes extends Global{
        public Eyes(){
            super("Глаза");
        }

        public void cry(){
            System.out.println("Слёзы выступили на " + this.getName());
        }
    }

    private class Mouth extends Global{
        public Mouth(){
            super("Рот");
        }

        public void burn(){
            System.out.println(this.getName() + " горел огнем");
        }
    }


}
