package abstractclass.gamecharacter;

public class AxeWarrior extends Character {

    public AxeWarrior(Point position) {
        super(position);
    }

    private int getActualSecondaryDamage() {
        return random.nextInt(1, 5);
//        return random.nextInt(1, (getActualPrimaryDamage() * 2));
    }

    public void secondaryAttack(Character enemy) {
        if (getPosition().distance(enemy.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}