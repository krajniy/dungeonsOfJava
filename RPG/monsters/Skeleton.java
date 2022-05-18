package RPG.monsters;

public class Skeleton extends MonsterClass {
    private int level;
    public Skeleton(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Skeleton{" +
                "level=" + level +
                '}';
    }
}
