package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance_2Test {
    public static void main(String[] args) {
        Performance_2 performance = new Performance_2("1989-06-02", "Queen", "18:30", "20:00");
        System.out.println("Előadó: " + performance.getArtist());
        System.out.println("Fellépés napja: " + performance.getDate());
        System.out.println("Koncert kezdete: " + performance.getStartTime());
        System.out.println("Koncert vége: " + performance.getEndTime());
        System.out.println("Infó --> " + performance.getInfo());
        }
    }
