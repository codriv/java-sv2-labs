package meetingrooms;

import java.util.Scanner;

public class MeetingRoomControllerStringCase {

    private Office office = new Office();
    Scanner scanner = new Scanner(System.in);

    public void runMenu() {
        printMenu();
        System.out.print("\n\nVálasszon menüpontot: ");
        String nr = scanner.nextLine();
        switch (nr) {
            case "1":
                readOffice();
                break;
            case "2":
                office.printNames();
                break;
            case "3":
                office.printNamesReverse();
                break;
            case "4":
                office.printEvenNames();
                break;
            case "5":
                office.printAreas();
                break;
            case "6":
                System.out.print("\nÍrja be a tárgyaló pontos nevét: ");
                String name = scanner.nextLine();
                office.printMeetingRoomsWithName(name);
                break;
            case "7":
                System.out.print("\nÍrjon be egy részletet a keresett névből: ");
                String namePart = scanner.nextLine();
                office.printMeetingRoomsConatains(namePart);
                break;
            case "8":
                System.out.print("\nÍrja be a méretet, aminél nagyobb területű tárgyalókat akar: ");
                int area = scanner.nextInt();
                scanner.nextLine();
                office.printAreasLargerThan(area);
                break;
            case "9": break;
            default:
                System.out.println("Adjon meg egy számot 1-9-ig!");
        }
        if (!nr.equals("9")) {
            runMenu();
        }
    }

    public void readOffice() {
        System.out.println("\nAdja meg a tárgyaló adatait!");
        System.out.print(" A tárgyaló neve: ");
        String name = scanner.nextLine();
        System.out.print(" A tárgyaló hosszúsága [m]: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" A tárgyaló szélessége [m]: ");
        int width = scanner.nextInt();
        scanner.nextLine();
        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public void printMenu() {
        StringBuilder menu = new StringBuilder("\nMENÜ\n");
        menu.append(" 1. Tárgyaló rögzítése\n 2. Tárgyalók sorrendben\n 3. Tárgyalók visszafele sorrendben");
        menu.append("\n 4. Minden második tárgyaló\n 5. Területek\n 6. Keresés pontos név alapján");
        menu.append("\n 7. Keresés névtöredék alapján\n 8. Keresés terület alapján\n 9. Kilépés");
        System.out.print(menu);
    }

    public static void main(String[] args) {
        System.out.println("\nTárgyaló nyilvántartás");
        MeetingRoomControllerStringCase meetingRoomController = new MeetingRoomControllerStringCase();
        meetingRoomController.runMenu();
    }
}
