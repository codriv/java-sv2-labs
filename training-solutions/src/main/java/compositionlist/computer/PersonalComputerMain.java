package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {

        PersonalComputer pc = new PersonalComputer(new Cpu("AMD", 3.2));
        pc.addHardware(new Hardware("HDD", "WD"));
        pc.addHardware(new Hardware("VGA", "ATI"));
        pc.addSoftware(new Software("Windows", 10.0));
        pc.addSoftware(new Software("Intellij IDEA", 2021.2));

        System.out.println(pc);

        System.out.println(pc.getHardwares());
        System.out.println(pc.getSoftwares());

        System.out.println(pc.getHardwares().get(1));
        System.out.println(pc.getHardwares().get(1).getModel());

        System.out.println(pc.getSoftwares().get(0).getNumberOfVersion());

        System.out.println(10.2e4);
    }
}
