package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint;
    protected Random random = new Random();

    public Character(Point position) {
        this.position = position;
        hitPoint = 100;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(1, 10);
    }

    private int getActualDefence() {
        return random.nextInt(0, 5);
    }

    protected void hit(Character enemy, int damage) {
        int actualDefence = enemy.getActualDefence();
        if (actualDefence < damage) {
            int diff = damage - actualDefence;
            decreaseHitPoint(diff);
        }
    }

    private void decreaseHitPoint(int diff) {
        hitPoint = diff > hitPoint ? 0 : hitPoint - diff;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    abstract public void secondaryAttack(Character enemy);
}