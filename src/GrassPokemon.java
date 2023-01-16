import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GrassPokemon extends Pokemon{

    private final String type = "grass";

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return type;
    }

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    List<String> getAttacks() {
        return attacks;
    }

    void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm!");
        damageChecker(enemy);
    };

    void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam!");
        damageChecker(enemy);
    };

    void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed!");
        damageChecker(enemy);
    };

    void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade!");
        damageChecker(enemy);
    };
    void damageChecker(Pokemon enemy){
        if (Objects.equals(enemy.getType(), "electric")){
            System.out.println("It's super effective!");
            System.out.println(enemy.getName() + " loses " + (getHp()/10) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "fire")) {
            System.out.println("It's an effective hit!");
            System.out.println(enemy.getName() + " loses " + (getHp()/20) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "water")) {
            System.out.println("It's a hit!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 30) + " hitpoints! ");
        }  else {
            System.out.println("It's not very effective!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 40) + " hitpoints! ");
        }
    }

}
