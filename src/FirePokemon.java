import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FirePokemon extends Pokemon{


    private final String type = "fire";
    List<String> attacks = Arrays.asList("firelash", "inferno", "pyroball", "flamethrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return type;
    }


    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Firelash!");

        damageChecker(enemy);
    };

    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall!");
        damageChecker(enemy);
    };

    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno!");
        damageChecker(enemy);
    };

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower!");
        damageChecker(enemy);
    };

    void damageChecker(Pokemon enemy){
        if (Objects.equals(enemy.getType(), "grass")){
            System.out.println("It's super effective!");
            System.out.println(enemy.getName() + " loses " + (getHp()/10) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "water")) {
            System.out.println("It's an effective hit!");
            System.out.println(enemy.getName() + " loses " + (getHp()/20) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "electric")) {
            System.out.println("It's a hit!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 30) + " hitpoints! ");
        }  else {
            System.out.println("It's not very effective!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 40) + " hitpoints! ");
        }
    }

}
