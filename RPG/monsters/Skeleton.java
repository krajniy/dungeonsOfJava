package monsters;

public class Skeleton extends monsters.MonsterClass {
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
