package composition.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }

    public String personToString() {
        return "\n name: " + name +
                "\n identificationCard: " + identificationCard +
                " address: " + address.addressToString();
    }

    public void correctData(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
