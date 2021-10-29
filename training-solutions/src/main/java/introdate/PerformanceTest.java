package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance(LocalDate.of(1989, 6, 2), "Queen", LocalTime.of(18, 30), LocalTime.of(20,00));
        System.out.println("Előadó: " + performance.getArtist());
        System.out.println("Fellépés napja: " + performance.getDate());
        System.out.println("Koncert kezdete: " + performance.getStartTime());
        System.out.println("Koncert vége: " + performance.getEndTime());
        System.out.println("Infó --> " + performance.getInfo());
        }
    }
