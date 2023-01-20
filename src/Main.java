import enums.Duration;
import objects.*;

public class Main {
    public static void main(String[] args) {

        Carlson carlson = new Carlson("Карлсон");
        LittleBoy littleBoy = new LittleBoy("Малыш");
        MissBok missBok = new MissBok("Фрекен Бок");

        Food meatSauce = new Food("Мясной соус");
        Food meat = new Food("Мясо");
        Food newDishes = new Food("Новые блюда");

        Structure tower = new Structure("Башня", meat.getName());
        Structure moat = new Structure("Крепостной ров", meatSauce.getName());

        carlson.takeTheFood(meatSauce);
        littleBoy.takeTheFood(meatSauce);
        littleBoy.scared(newDishes, Duration.ALWAYS);
        littleBoy.ate(meatSauce, Duration.NEVER);

        carlson.startBuildingACastle(tower, moat);
        littleBoy.tasteTheFood();
        littleBoy.sayOops();
        littleBoy.cry();
        littleBoy.feelHot();

        missBok.standBy();
        missBok.aggressiveLookAtSo(littleBoy);

        littleBoy.keepSilence();
    }
}