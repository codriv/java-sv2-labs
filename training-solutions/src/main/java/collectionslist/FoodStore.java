package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;

public class FoodStore {

    private LinkedList<Food> foods = new LinkedList<>();

    public LinkedList<Food> getFoods() {
        return foods;
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public void sellFirst(Food food) {
        if (food.getBestBefore().isEqual(LocalDate.now())) {
            foods.add(0, food);
        }
    }
}
