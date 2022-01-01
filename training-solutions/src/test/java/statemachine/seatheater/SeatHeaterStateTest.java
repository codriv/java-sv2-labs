package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void switchToNextTest() {
        assertEquals(SeatHeaterState.THREE, SeatHeaterState.OFF.switchToNext());
        assertEquals(SeatHeaterState.TWO, SeatHeaterState.THREE.switchToNext());
        assertEquals(SeatHeaterState.ONE, SeatHeaterState.TWO.switchToNext());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.ONE.switchToNext());
    }
}