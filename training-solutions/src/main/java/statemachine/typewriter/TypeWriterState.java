package statemachine.typewriter;

public enum TypeWriterState {

    ON {
        @Override
        TypeWriterState switchCapsLock() {
            return TypeWriterState.OFF;
        }
    },

    OFF {
        @Override
        TypeWriterState switchCapsLock() {
            return TypeWriterState.ON;
        }
    };

    abstract TypeWriterState switchCapsLock();
}
