import java.util.Objects;

public class Character {
    //Déclarer un attribut :
    String name;
    int type;
    int lifeLevel;
    int attackLevel;
    OffensiveEquipment offensiveEquipment;
    DefensiveEquipment defensiveEquipment;

    public Character() {


    }

    public  Character(String name, int type) {
        this.type=type;
        this.name=name;


        if (type == 1) {
            this.lifeLevel = 10;
            this.attackLevel = 10;
            this.offensiveEquipment = new OffensiveEquipment("sword", "weapon", 3);
            this.defensiveEquipment = new DefensiveEquipment("shield", "shield", 2);
        } else {
            this.lifeLevel = 6;
            this.attackLevel = 15;
            this.offensiveEquipment = new OffensiveEquipment("fire ball", "spell", 3);
            this.defensiveEquipment = new DefensiveEquipment("potion", "filter", 2);
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", lifeLevel=" + lifeLevel +
                ", attackLevel=" + attackLevel +
                ", offensiveEquipment=" + offensiveEquipment +
                ", defensiveEquipment=" + defensiveEquipment +
                '}';
    }

    /* public void initCharacter() {
        int userCharacterChoice = ui.getCharacterChoice();
        System.out.println(userCharacterChoice);
    }

    public void initNameCharacter() {
        String userCharacterName = ui.getCharacterName();
        System.out.println(userCharacterName);
    }
*/

}


