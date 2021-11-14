package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("\nA tárgyalók listája (létrehozás sorrendjében):");
        for (MeetingRoom room: meetingRooms) {
            System.out.println(" " + room.getName());
        }
    }

    public void printNamesReverse() {
        System.out.println("\nA tárgyalók listája (fordított sorrendben):");
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(" " + meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        System.out.println("\nA tárgyalók listája (minden második):");
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(" " + meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        System.out.println("\nA tárgyalók területe:");
        for (int i = 0; i < meetingRooms.size(); i++) {
            System.out.printf(" %d. %s: ", (i + 1), meetingRooms.get(i).getName());
            System.out.printf("%d x %d = %d m\u00b2\n", meetingRooms.get(i).getLength(),
                    meetingRooms.get(i).getWidth(), meetingRooms.get(i).getArea());
        }
    }

    public void printMeetingRoomsWithName(String name) {
//        boolean match = false;
        for (MeetingRoom room: meetingRooms) {
            if (room.getName().equals(name)) {
                System.out.println("\n A kiválasztott tárgyaló adatai: ");
                System.out.printf("  név: %s\n  hosszúság: %d\n  szélesség: %d\n  trerület: %d\n",
                        name, room.getLength(), room.getWidth(), room.getArea());
//                match = true;
            }
        }
//        if (!match) {System.out.println(" Nincs ilyen nevű tárgyaló!");}
    }

    public void printMeetingRoomsConatains(String part) {
        StringBuilder matches = new StringBuilder();
        for (MeetingRoom room: meetingRooms) {
            if (room.getName().toLowerCase().contains(part.toLowerCase())) {
                matches.append(String.format("  %s | hossz: %d | szélesség: %d | terület: %d\n",
                    room.getName(), room.getLength(), room.getWidth(), room.getArea()));
            }
        }
        if (matches.isEmpty()) {
            System.out.printf(" A megadott részlet (%s) egyik tárgyaló nevében sem szerepel!\n", part);
        } else {
            System.out.printf("\n A megadott részlet (%s) a következő tárgyalók nevében szerepel:\n", part);
            System.out.print(matches);
        }
    }

    public void printAreasLargerThan(int area) {
        System.out.printf("\nA tárgyalók listája, amelyek nagyobbak, mint %d m\u00b2:\n", area);
        for (MeetingRoom room: meetingRooms) {
            if (room.getArea() > area) {
                System.out.printf(" %s | hossz: %d | szélesség: %d | terület: %d\n",
                        room.getName(), room.getLength(), room.getWidth(), room.getArea());
            }
        }
    }
}
