package composition.person;

public class Person2 {
    private String name;
    private String identificationCard;
    private Address address;

    public Person2(String name, String identificationCard, String country, String city, String streetAndNumber, String zipCode) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = new Address(country, city, streetAndNumber, zipCode);
    }

    public String personToString() {
        return "\n name: " + name +
                "\n identificationCard: " + identificationCard +
                "\n address: " + address.addressToString();
    }

    public void correctData(String name, String identificationCard, String country, String city, String streetAndNumber, String zipCode) {
        this.name = name;
        this.identificationCard = identificationCard;
        address = new Address(country, city, streetAndNumber, zipCode);
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public Address getAddressObject() {
        return address;
    }

    public String getAddress() {
        return address.addressToString();
    }
}
