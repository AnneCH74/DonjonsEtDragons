public class DefensiveEquipment {
    String name;
    String type;
    int levelDefense;

    public DefensiveEquipment(String name, String type, int levelDefense) {
        this.name = name;
        this.type = type;
        this.levelDefense = levelDefense;
    }

    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", levelDefense=" + levelDefense +
                '}';
    }
}
