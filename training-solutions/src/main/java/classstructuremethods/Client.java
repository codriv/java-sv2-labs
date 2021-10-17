package classstructuremethods;

public class Client {
    private String name;
    private Integer year;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public Integer getYear() {
        return year;
    }
    public void setYear(Integer newYear) {
        year = newYear;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void migrate(String address) {
        this.address = address;
    }
}
