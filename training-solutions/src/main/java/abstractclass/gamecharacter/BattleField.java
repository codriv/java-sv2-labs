package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
            if (defender.isAlive()) {
                attacker.secondaryAttack(defender);
            }
        }
        return defender.isAlive() && attacker.isAlive();
    }

    public Character fight(Character one, Character other) {
        while (oneHit(one, other)) {
            round++;
            oneHit(other, one);
        }
        return one.isAlive() ? one : other;
    }
}