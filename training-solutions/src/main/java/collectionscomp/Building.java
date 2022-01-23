package collectionscomp;

import java.util.Objects;
import java.util.TreeSet;

public class Building implements Comparable<Building>{

    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int compareTo(Building o) {
        return ((Integer)levels).compareTo((Integer)o.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                '}' + "\n";
    }

    public static void main(String[] args) {
        TreeSet<Building> buildings = new TreeSet<>();
        buildings.add(new Building("utca", 150, 2));
        buildings.add(new Building("tér", 100, 3));
        buildings.add(new Building("köz", 50, 1));
        buildings.add(new Building("dűlő", 250, 4));

        System.out.println(buildings);
    }
}
