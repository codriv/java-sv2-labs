package linebreak;

public class Car {
    public static String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + "\n" + type;
    }
    public static void main(String[] args) {
        System.out.println(getBrandAndTypeInSeparateLines("VW", "Golf"));
    }
}
