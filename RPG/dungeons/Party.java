package dungeons;

import classes.CharacterClass;
import dungeons.Dungeon;

public class Party {
    private CharacterClass[] partyMembers;
    private Dungeon dungeon;

    public Party(CharacterClass... members) {
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = members[i];

        }
    }
    public boolean enterDungeon(Dungeon dungeon){
        return dungeon.open((this));
    }
    public void runDungeon(){
//        for cycle where all party members attack monsters

    }
    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }
    public void info(){
        for(CharacterClass partyMember : partyMembers){
            partyMember.info();
        }
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
}
