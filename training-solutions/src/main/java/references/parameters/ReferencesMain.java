package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person p1;
        Person p2;

        Person person = new Person("Nagy Sándor", 55);
        p1 = person;
        p2 = p1;
        p2.setName("Kis Sándor");

        System.out.println(p1);
        System.out.println(p2);

        int num1 = 24;
        int num2 = num1;
        num2++;
        System.out.println(num1);
        System.out.println(num2);

        Person newPerson = new Person("Futaki Bátor", 35);
        p2 = newPerson;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(newPerson);
    }
}
