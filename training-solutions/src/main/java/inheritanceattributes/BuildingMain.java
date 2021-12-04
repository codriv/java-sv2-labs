package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {

        Building building = new Building("Ház", 150, 2);
        SchoolBuilding schoolBuilding = new SchoolBuilding(5);

        System.out.println(building.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
        System.out.println(building.area);
        System.out.println(building.name);
    }
}