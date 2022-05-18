package monsters;

public class Necromancer extends monsters.MonsterClass {
    private int level;
    public Necromancer(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Necromancer " + this.level + " " + "Level";
    }
}
