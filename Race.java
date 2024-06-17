import java.util.Scanner;

public class Race extends Adventurers {
    Scanner in = new Scanner(System.in);

    private String race;
    private String description;
    private String specialAbility;
    private int strengthModifier;
    private int agilityModifier;
    private int intelligenceModifier;

    public Race() {
        System.out.println("Adventurers race choose\n"
        + " 'Dwarf', 'Orc', 'Human', 'Elf' ");
        this.race = in.nextLine().toLowerCase();

        switch (race) {
            case "elf":
                this.description = "Elves are agile and intelligent, proficient in magic and archery.";
                this.specialAbility = "Night Vision";
                this.strengthModifier = -1;
                this.agilityModifier = 2;
                this.intelligenceModifier = 3;
                break;
            case "dwarf":
                this.description = "Dwarves are strong and resilient, skilled craftsmen and warriors.";
                this.specialAbility = "Stonecunning";
                this.strengthModifier = 3;
                this.agilityModifier = -1;
                this.intelligenceModifier = 1;
                break;
            case "orc":
                this.description = "Orcs are strong and fierce warriors, known for their brute strength.";
                this.specialAbility = "Berserker Rage";
                this.strengthModifier = 4;
                this.agilityModifier = -2;
                this.intelligenceModifier = 0;
                break;
            case "human":
                this.description = "Humans are adaptable and strong in many roles.";
                this.specialAbility = "Versatility";
                this.strengthModifier = 1;
                this.agilityModifier = 1;
                this.intelligenceModifier = 1;
                break;
            default:
                System.out.println("Unknown race...What is that..");
                this.description = "Unknown race.";
                this.specialAbility = "None";
                this.strengthModifier = 0;
                this.agilityModifier = 0;
                this.intelligenceModifier = 0;
                break;
        }
    }

    public String getRaceDetails() {
        return "Race: " + race + "\nDescription: " + description + "\nSpecial Ability: " + specialAbility +
               "\nStrength Modifier: " + strengthModifier + "\nAgility Modifier: " + agilityModifier + 
               "\nIntelligence Modifier: " + intelligenceModifier;
    }
}
