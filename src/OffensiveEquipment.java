public class OffensiveEquipment {
    String name;
    String type;
    int levelAttack;

    public OffensiveEquipment(String name, String type, int levelAttack) {
        this.name = name;
        this.type = type;
        this.levelAttack = levelAttack;
    }

    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", levelAttack=" + levelAttack +
                '}';
    }
}


