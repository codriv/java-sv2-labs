package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\r\nZeneszám 1.0\r\n");
        System.out.println("Adja meg a kedvenc zeneszámát!");
        System.out.println(" Előadó:");
        song.band = scanner.nextLine();
        System.out.println(" A szám címe:");
        song.title = scanner.nextLine();
        System.out.println(" A szám hossza percben:");
        song.length = scanner.nextInt();
        System.out.println("\r\nAz ön kedvenc zeneszáma:");
        System.out.println(" " + song.band + " - " + song.title + " (" + song.length + " perc)");
    }
}
