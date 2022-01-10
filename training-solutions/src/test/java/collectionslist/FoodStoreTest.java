package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    @Test
    void sellFirst() {
        FoodStore foodStore = new FoodStore();
        foodStore.addFood(new Food("milk", LocalDate.of(2022, 2, 5)));
        foodStore.addFood(new Food("meat", LocalDate.of(2022, 2, 6)));
        foodStore.sellFirst(new Food("sandwich", LocalDate.now()));
        foodStore.addFood(new Food("juice", LocalDate.of(2022, 3, 8)));

        assertEquals("sandwich", foodStore.getFoods().get(0).getName());
    }
}