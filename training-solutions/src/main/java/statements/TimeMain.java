package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\r\nIdőpontok 1.0\r\n");
        System.out.println("Adjon meg egy időpontot [ó p m] formában!");
        Time time = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Adjon meg még egy időpontot [ó p m] formában!");
        Time time2 = new Time(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("\r\nAz első időpont: " + time.toString() + " (" + time.getInMinutes() + " perc)");
        System.out.println("Az második időpont: " + time2.toString() + " (" + time2.getInSeconds() + " másodperc)");
        System.out.println("Az első időpont korábbi a másodiknál: " + time.earlierThan(time2));
    }
}
