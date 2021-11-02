package composition.person;

public class Person2Main {
    public static void main(String[] args) {
        Person2 person2 = new Person2("Nagy Sándor", "AB7985", "Magyarország", "Tar", "Sport út 10.", "3073");
        System.out.println(person2.personToString());

        person2.moveTo(new Address("Szlovákia", "Fülek", "Fő út 25.", "986 01"));
        System.out.println(person2.personToString());

        System.out.println("\naddress:" + person2.getAddress());

        person2.correctData("Kis Pál", "CD1423","Ausztria","Miklóshalma","Berggasse 4.","2425");
        System.out.println(person2.personToString());

        person2.getAddressObject().correctData("Románia", "Arad", "Minervei út 45.", "310410");
        System.out.println("\nnew address:" + person2.getAddress());
    }
}
