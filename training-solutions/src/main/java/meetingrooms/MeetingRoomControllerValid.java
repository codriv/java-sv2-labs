package meetingrooms;

import java.util.Scanner;

public class MeetingRoomControllerValid {

    private Office office = new Office();
    Scanner scanner = new Scanner(System.in);

    public void runMenu() {
        printMenu();
        String input;
        do {
            System.out.print("Válasszon menüpontot: ");
            input = scanner.nextLine();
        } while (
                input.matches(".*\\D.*") ||
                        Integer.parseInt(input) < 1 ||
                        Integer.parseInt(input) > 9
        );
        int nr = Integer.parseInt(input);
        switch (nr) {
            case 1:
                readOffice();
                break;
            case 2:
                office.printNames();
                break;
            case 3:
                office.printNamesReverse();
                break;
            case 4:
                office.printEvenNames();
                break;
            case 5:
                office.printAreas();
                break;
            case 6:
                System.out.print("\nÍrja be a tárgyaló pontos nevét: ");
                String name = scanner.nextLine();
                office.printMeetingRoomsWithName(name);
                break;
            case 7:
                System.out.print("\nÍrjon be egy részletet a keresett névből: ");
                String namePart = scanner.nextLine();
                office.printMeetingRoomsConatains(namePart);
                break;
            case 8:
                System.out.println();
                String areaString;
                do {
                    System.out.print("Írja be a méretet, aminél nagyobbat akar: ");
                    areaString = scanner.nextLine();
                } while (
                    areaString.matches(".*\\D.*")
                );
                int area = Integer.parseInt(areaString);
                office.printAreasLargerThan(area);
            case 9:
                System.out.println("\nViszontlátásra!");
        }
        if (nr != 9) {
            runMenu();
        }
    }

    public void readOffice() {
        System.out.println("\nAdja meg a tárgyaló adatait!");
        System.out.print(" A tárgyaló neve: ");
        String name = scanner.nextLine();
        String lengthString;
        do {
            System.out.print(" A tárgyaló hosszúsága [m]: ");
            lengthString = scanner.nextLine();
        } while (
            lengthString.matches(".*\\D.*")
        );
        int length = Integer.parseInt(lengthString);
        String widthString;
        do {
            System.out.print(" A tárgyaló szélessége [m]: ");
            widthString = scanner.nextLine();
        } while (
            widthString.matches(".*\\D.*")
        );
        int width = Integer.parseInt(widthString);
        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public void printMenu() {
        StringBuilder menu = new StringBuilder("\nMENÜ\n");
        menu.append(" 1. Tárgyaló rögzítése\n 2. Tárgyalók sorrendben\n 3. Tárgyalók visszafele sorrendben");
        menu.append("\n 4. Minden második tárgyaló\n 5. Területek\n 6. Keresés pontos név alapján");
        menu.append("\n 7. Keresés névtöredék alapján\n 8. Keresés terület alapján\n 9. Kilépés\n");
        System.out.println(menu);
    }

    public static void main(String[] args) {
        System.out.println("\nTárgyaló nyilvántartás");
        MeetingRoomControllerValid meetingRoomController = new MeetingRoomControllerValid();
        meetingRoomController.runMenu();
    }
}
