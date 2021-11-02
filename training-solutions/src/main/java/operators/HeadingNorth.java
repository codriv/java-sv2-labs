package operators;

public class HeadingNorth {
    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
    public String getNumberOfNewDirections() {
        int count = 0;
        for (int i = 0; i < 36; i += count) {
            count++;
            System.out.println(count + ": +" + (count * 10) + " fok = " + ((i + count) * 10) + " fok");
        }
        return "Összesen " + count + " alkalommal fordult.";
    }
}
