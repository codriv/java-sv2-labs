package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class VaccineTest {

    Vaccine vaccine;
    List<Person> registrated;

    @BeforeEach
    void init() {

        registrated = new ArrayList<>();
        registrated.add(new Person("Váradi Etelka", 25, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Kocsis Nikoletta", 24, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Kerekes Zsombor", 32, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Dobos József", 74, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Pásztor Elek", 43, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Rácz Ibolya", 23, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Budai Andor", 35, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Kovács Roberta", 21, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Varga Henrik", 60, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Szabó Gergő", 27, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Kozma Rózsa", 49, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Fazekas Márta", 51, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Bognár Erika", 85, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Piros Alma", 32, ChronicDisease.YES, Pregnancy.YES));
        registrated.add(new Person("Nagy Barbara", 100, ChronicDisease.YES, Pregnancy.NO));
    }

    @Test
    void testFirstVaccine() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(registrated);

        Assertions.assertEquals(15, vaccine.getVaccinationList().size());
        Assertions.assertEquals("Bognár Erika", vaccine.getVaccinationList().get(4).getName());
        Assertions.assertEquals(25, vaccine.getVaccinationList().get(6).getAge());
        Assertions.assertEquals("NO", vaccine.getVaccinationList().get(9).getChronic().name());
        Assertions.assertEquals("NO", vaccine.getVaccinationList().get(13).getPregnant().name());
    }

    @Test
    void testSecondVaccine() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(registrated);

        Assertions.assertEquals(7, vaccine.getVaccinationList().size());
        Assertions.assertEquals("Varga Henrik", vaccine.getVaccinationList().get(3).getName());
        Assertions.assertEquals(35, vaccine.getVaccinationList().get(2).getAge());
        Assertions.assertEquals(74, vaccine.getVaccinationList().get(5).getAge());
    }
}