package abstractclass.gamecharacter;

public class Archer extends Character {

    private int numberOfArrow;

    public Archer(Point position) {
        super(position);
        numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage() {
        return random.nextInt(1, 5);
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow --;
        hit(enemy, getActualSecondaryDamage());
    }

    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}