package monsters;

import classes.AttackType;
import classes.BaseClass;
import dungeons.BasicDungeon;

public abstract class MonsterClass implements BaseClass {
    private int healthPoints;
    private int manaPoints;
    private int level;
    private AttackType attackType;
    private int attackAmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;

    @Override
    public void attack() {

    }

    @Override
    public void restoreHealth(int amount) {

    }

    @Override
    public void loseHealth(int amount) {

    }

    @Override
    public void restoreMana(int amount) {

    }

    @Override
    public void loseMana(int amount) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {

    }


}
