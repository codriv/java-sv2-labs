package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("kék");
        capsules.addLast("piros");
        capsules.addLast("zöld");
        capsules.addLast("sárga");
        capsules.addLast("fekete");
        capsules.addLast("fehér");

        System.out.println(capsules.getColors());

        capsules.removeFirst();
        capsules.removeLast();

        System.out.println(capsules.getColors());
    }
}
