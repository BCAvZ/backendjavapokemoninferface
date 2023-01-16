import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ElectricPokemon extends Pokemon{

    private final String type = "electric";


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return type;
    }

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch!");
        damageChecker(enemy);
    };

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall!");
        damageChecker(enemy);
    };

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder!");
        damageChecker(enemy);
    };

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle!");
        damageChecker(enemy);
    };
    void damageChecker(Pokemon enemy){
        if (Objects.equals(enemy.getType(), "water")){
            System.out.println("It's super effective!");
            System.out.println(enemy.getName() + " loses " + (getHp()/10) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "grass")) {
            System.out.println("It's an effective hit!");
            System.out.println(enemy.getName() + " loses " + (getHp()/20) + " hitpoints! ");
        } else if (Objects.equals(enemy.getType(), "fire")) {
            System.out.println("It's a hit!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 30) + " hitpoints! ");
        }  else {
            System.out.println("It's not very effective!");
            System.out.println(enemy.getName() + " loses " + (getHp() / 40) + " hitpoints! ");
        }
    }


}
