import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WaterPokemon extends Pokemon{

    private final String type = "water";

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType(){
        return type;
    }

    List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf!");
        damageChecker(enemy);
    };

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump!");
        damageChecker(enemy);
    };

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydrocanon!");
        damageChecker(enemy);
    };

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with raindance!");
        damageChecker(enemy);
    };

    void damageChecker(Pokemon enemy){
        if (Objects.equals(enemy.getType(), "fire")){
            System.out.println("It's super effective!");
            System.out.println(enemy.getName() + " loses " + (getHp()/10) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "electric")) {
            System.out.println("It's an effective hit!");
            System.out.println(enemy.getName() + " loses " + (getHp()/20) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "grass")) {
            System.out.println("It's a hit!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 30) + " hitpoints! ");
        }  else {
            System.out.println("It's not very effective!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 40) + " hitpoints! ");
        }
    }


}
