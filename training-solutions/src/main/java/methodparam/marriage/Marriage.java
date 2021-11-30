package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man) {
        woman.getRegisterDates().add(new RegisterDate("Házasságkötés ideje", LocalDate.now()));
        man.getRegisterDates().add(new RegisterDate("Házasságkötés ideje", LocalDate.now()));
        setNameOfWoman(woman, man);
    }
    private void setNameOfWoman(Woman woman, Man man) {
        String newName = man.getName().split(" ")[0] + "né " + woman.getName();
        woman.setName(newName);
    }
}