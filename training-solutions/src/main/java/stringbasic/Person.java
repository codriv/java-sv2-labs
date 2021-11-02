package stringbasic;

public class Person {
    private String name;
    private String email;
    private String tajNumber;
    private String accountNumber;
    private String phoneNumber;

    public Person(String name, String email, String tajNumber, String accountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.tajNumber = tajNumber;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    public void setTajNumber(String tajNumber) {
        this.tajNumber = tajNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
