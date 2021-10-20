package packages.namemain;

import packages.prefix.Prefix;
import packages.firstname.FirstName;
import packages.lastname.LastName;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Dr.");
        FirstName firstName = new FirstName("Bátor");
        LastName lastName = new LastName("Futaki");
        System.out.println(prefix.getPre() + " " + firstName.getFirst() + " " + lastName.getLast());
    }
}
