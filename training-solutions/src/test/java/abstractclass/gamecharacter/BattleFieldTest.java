package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    @Test
    void testBattleField() {

        Archer archer = new Archer(new Point(2, 4));
//        Character archer = new Archer(new Point(2, 4));
        Character axeWarrior = new AxeWarrior(new Point(3, 5));
        BattleField battleField = new BattleField();

        System.out.println(archer.getPosition().distance(axeWarrior.getPosition()));
        System.out.println(battleField.fight(archer, axeWarrior));
        System.out.println(axeWarrior.isAlive());
        System.out.println(axeWarrior.getHitPoint());
        System.out.println(archer.isAlive());
        System.out.println(archer.getHitPoint());
        System.out.println(battleField.getRound());
        System.out.println(archer.getNumberOfArrow());
    }
}