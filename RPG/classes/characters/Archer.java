package classes.characters;

import classes.AttackType;
import classes.CharacterClass;

public class Archer extends CharacterClass {
    public Archer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(75);
        this.setMaxManaPoints(50);
        this.setHealthPoints(75);
        this.setManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(7);
    }
}
