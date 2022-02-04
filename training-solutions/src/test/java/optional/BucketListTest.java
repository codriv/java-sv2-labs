package optional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {

    private List<Destination> destinations = Arrays.asList(
            new Destination("egy", "leirasEgy", 25),
            new Destination("ketto", "leirasKetto", 15),
            new Destination("harom", "leirasHarom", 10),
            new Destination("negy", "leirasNegy", 20)
    );

    BucketList bucketList = new BucketList(destinations);

    @Test
    void getDestinationWithKeyword() {
        assertEquals("harom", bucketList.getDestinationWithKeyword("asHar").get().getName());
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> bucketList.getDestinationWithKeyword("valami").orElseThrow(()->new IllegalArgumentException("Not found!")));
        assertEquals("Not found!", iae.getMessage());
    }

    @Test
    void getDestinationNearerThanGiven() {
        assertEquals("leirasKetto", bucketList.getDestinationNearerThanGiven(20).get().getDescription());
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> bucketList.getDestinationNearerThanGiven(5).orElseThrow(()->new IllegalArgumentException("Not found!")));
        assertEquals("Not found!", iae.getMessage());
    }
}