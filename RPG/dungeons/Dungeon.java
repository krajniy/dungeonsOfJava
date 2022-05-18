package dungeons;

import monsters.MonsterClass;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon implements BasicDungeon {
    private boolean isOpen = false;
    private MonsterClass[] monsters;
    private ArrayList<MonsterClass> monstersArray;

    public void meetMonster(ArrayList<MonsterClass> arrayList){
        if(isOpen == false){
            System.out.println("You are not in Dungeon!");
        }
        Random random = new Random();
        int i = random.nextInt(arrayList.size());
        System.out.println("Meet inglorious " + arrayList.get(i).toString());
    }


    @Override
    public boolean open(Party party) {
        if(party.getPartyMembers().length < 3){
            System.out.println("Not enough party members!");
            isOpen = false;
        }
        else {
            System.out.println("Welcome, heroes!");
            isOpen = true;
        }
        return isOpen;
    }
}
