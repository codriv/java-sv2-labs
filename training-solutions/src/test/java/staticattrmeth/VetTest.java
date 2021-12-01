package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    Dog dog1 = new Dog("Ubul", 2, Species.BEAGLE);
    Dog dog2 = new Dog("Kántor", 5, Species.GERMAN_SHEPHERD);
    Dog dog3 = new Dog("Pasa", 7, Species.LABRADOR);

    @Test
    void testAddDog() {
        Vet vet = new Vet();
        vet.addDog(dog1);
        vet.addDog(dog2);
        assertEquals(3, Vet.code);
        assertEquals(2, dog2.getCode());
        assertEquals(2, vet.getDogs().size());
    }
}