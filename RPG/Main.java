package RPG;

import RPG.classes.characters.Archer;
import RPG.classes.characters.Healer;
import RPG.classes.characters.Mage;
import RPG.classes.characters.Warrior;
import RPG.dungeons.Dungeon;
import RPG.monsters.MonsterClass;
import RPG.monsters.Necromancer;
import RPG.monsters.Skeleton;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MonsterClass> monsters = new ArrayList<>();
        monsters.add(new Necromancer(10));
        monsters.add(new Necromancer(8));
        monsters.add(new Necromancer(6));
        monsters.add(new Skeleton(10));
        monsters.add(new Skeleton(8));
        monsters.add(new Skeleton(6));

        Party party = new Party(new Mage("Gendalf"), new Warrior("Aragorn"),
                new Archer("Legolas"), new Healer("Radogast"));
        party.info();
        Dungeon dungeon = new Dungeon();
        if(party.enterDungeon(dungeon)){
            party.setDungeon(dungeon);
            party.runDungeon();
            dungeon.meetMonster(monsters);
        } else System.out.println("Game over!");

    }

}
