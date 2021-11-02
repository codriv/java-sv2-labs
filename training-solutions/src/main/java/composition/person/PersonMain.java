package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Nagy Sándor", "AB7985", new Address("Magyarország", "Tar", "Sport út 10.", "3073"));
        System.out.println(person.personToString());

        person.moveTo(new Address("Szlovákia", "Fülek", "Fő út 25.", "986 01"));
        System.out.println(person.personToString());

        System.out.println("\naddress:" + person.getAddress().addressToString());

        person.correctData("Kis Pál", "CD1423", new Address("Ausztria", "Miklóshalma", "Berggasse 4.", "2425"));
        System.out.println(person.personToString());

        person.getAddress().correctData("Románia", "Arad", "Minervei út 45.", "310410");
        System.out.println("\nnew address:" + person.getAddress().addressToString());
    }
}
