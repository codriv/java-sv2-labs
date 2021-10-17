package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Nevem Senki");
        note.setTopic("Note app");
        note.setText("Ez a jegyzet szövege, ami a \"Note\" osztály \"text\" attribútuma, és a \"text\" nevű, String típusú privát változóban tárolódik.");
        System.out.println("\r\nNote 1.0\r\n");
        System.out.println(note.getNoteText());
    }

}
