package polymorphism.river;

import java.util.List;

public class Danube extends River {

    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water danubeWater = new Danube("DanubeWater", 700, List.of(
                "Bécs", "Pozsony"));
        River danubeRiver = new Danube("DanubeRiver", 1400, List.of(
                "Bécs", "Pozsony", "Budapest"));
        Danube danubeDanube = new Danube("DanubeDanube", 2850, List.of(
                "Bécs", "Pozsony", "Budapest", "Belgrád"));

        System.out.println(danubeWater.getClass());
        System.out.println(danubeRiver.getName());
        System.out.println(danubeRiver.getClass());
        System.out.println(danubeRiver.getLength());
        System.out.println(danubeDanube.getName());
        System.out.println(danubeDanube.getClass());
        System.out.println(danubeDanube.getLength());
        System.out.println(danubeDanube.getCapitals());
    }
}
