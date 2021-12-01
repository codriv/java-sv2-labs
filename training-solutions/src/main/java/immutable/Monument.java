package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfRegistry;
    private final String registryNumber;

    public Monument(String name, String address, LocalDate dateOfRegistry, String registryNumber) {
        if (name == null || isEmpty(name) || address == null || isEmpty(address) ||
                registryNumber == null || isEmpty(registryNumber) ||
                dateOfRegistry == null || isEmpty(dateOfRegistry.toString())) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        } else {
            this.name = name;
            this.address = address;
            this.registryNumber = registryNumber;
            this.dateOfRegistry = dateOfRegistry;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }

    private boolean isEmpty(String text) {
        if (text.isBlank()) {
            return true;
        }
        return false;
    }
}
