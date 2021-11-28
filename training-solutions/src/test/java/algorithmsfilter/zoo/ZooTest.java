package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    List<Animal> animalsTest = Arrays.asList(
            new Animal("dog", 4),
            new Animal("horse", 4),
            new Animal("cat", 4),
            new Animal("chicken", 2),
            new Animal("fish", 0),
            new Animal("spider", 8),
            new Animal("ant", 6)
    );
    int numberOfLegsTest = 4;
    String nameOfAnimalExpected = "horse";
    int sizeOfListExpected = 3;

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        Zoo zoo = new Zoo(animalsTest);
        assertEquals(sizeOfListExpected, zoo.getAnimalsWithNumberOfLegsGiven(4).size());
        assertEquals(nameOfAnimalExpected, zoo.getAnimalsWithNumberOfLegsGiven(4).get(1).getName());
    }
}