package enumtypes.university;

public enum University {
    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"), SZE("Széchenyi István Egyetem"),
    SOE("Soproni Egyetem"), PE("Pannon Egyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
