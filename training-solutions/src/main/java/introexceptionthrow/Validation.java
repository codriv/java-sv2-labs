package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Érvénytelen név!");
        }
    }

    public void validateAge(String ageString) {

        if (ageString.isBlank()) {
            throw new IllegalArgumentException("Az életkor nem lehet üres!");
        }

        if (!ageString.matches("-?\\d+")) {
        throw new IllegalArgumentException("Számot adjon meg!");
        }

        int age = Integer.parseInt(ageString);
        if (0 > age || age > 120) {
            throw new IllegalArgumentException("Érvénytelen életkor!");
        }

/*      examination with Character.isDigit()

        for (Character character : ageString.toCharArray()) {
            if (!Character.isDigit(character)) {
                throw new IllegalArgumentException("Nem csak számot adott meg!");
            }
        }
 */

/*      examination with exception

        int age;
        try {
            age = Integer.parseInt(ageString);
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Nem számot adott meg!");
        }
*/

    }
}
