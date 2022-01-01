package statemachine.seatheater;

public enum SeatHeaterState {

    OFF {
        @Override
        SeatHeaterState switchToNext() {
            return SeatHeaterState.THREE;
        }
    },

    THREE {
        @Override
        SeatHeaterState switchToNext() {
            return SeatHeaterState.TWO;
        }
    },

    TWO {
        @Override
        SeatHeaterState switchToNext() {
            return SeatHeaterState.ONE;
        }
    },

    ONE {
        @Override
        SeatHeaterState switchToNext() {
            return SeatHeaterState.OFF;
        }
    };

    abstract SeatHeaterState switchToNext();
    }
