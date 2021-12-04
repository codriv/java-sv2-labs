package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void testCreate() {
        Person person = new Person("Nagy Sándor", "Vác, Kossuth u. 20.");

        Employee employee = new Employee("Kis Mari", "Ják, Petőfi u. 15.", 500_000);

        Boss boss = new Boss("Fekete Péter", "Göd, Fő. 35.", 800_000, 3);

        BigBoss bigBoss = new BigBoss("Futaki Bátor", "Ózd, Kerek u. 5.", 1_000_000, 4, 200_000);

        System.out.println();
        assertEquals("Nagy Sándor", person.getName());
        assertEquals("Vác, Kossuth u. 20.", person.getAddress());

        assertEquals("Kis Mari", employee.getName());
        assertEquals("Ják, Petőfi u. 15.", employee.getAddress());
        assertEquals(500_000, employee.getSalary());

        assertEquals("Fekete Péter", boss.getName());
        assertEquals("Göd, Fő. 35.", boss.getAddress());
        assertEquals(3, boss.getNumberOfEmployees());
        assertEquals(1_040_000, boss.getSalary());

        assertEquals("Futaki Bátor", bigBoss.getName());
        assertEquals("Ózd, Kerek u. 5.", bigBoss.getAddress());
        assertEquals(4, bigBoss.getNumberOfEmployees());
        assertEquals(200_000, bigBoss.getBonus());
        assertEquals(1_600_000, bigBoss.getSalary());

        person.migrate("Tas, Hosszú u. 1.");
        assertEquals("Tas, Hosszú u. 1.", person.getAddress());

        employee.migrate("Ács, Árnyas u. 9");
        assertEquals("Ács, Árnyas u. 9", employee.getAddress());

        boss.migrate("Ugod, Fácán u. 8.");
        assertEquals("Ugod, Fácán u. 8.", boss.getAddress());

        bigBoss.migrate("Dunaszeg, Gát u. 25.");
        assertEquals("Dunaszeg, Gát u. 25.", bigBoss.getAddress());

        assertEquals("Ács, Árnyas u. 9", employee.getAddress());

        employee.raiseSalary(30);
        assertEquals(650_000, employee.getSalary());

        bigBoss.raiseSalary(20);
        assertEquals(1_880_000, bigBoss.getSalary());
        assertEquals(1_040_000, boss.getSalary());
    }
}