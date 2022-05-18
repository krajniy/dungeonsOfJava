package classes.characters;

import classes.AttackType;
import classes.CharacterClass;

public class Healer extends CharacterClass {
    public Healer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(60);
        this.setMaxManaPoints(150);
        this.setHealthPoints(60);
        this.setManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(5);
    }
}
