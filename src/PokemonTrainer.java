import java.util.List;

public class PokemonTrainer {

    private String name;
    private static List<Pokemon> pokemons;

    public PokemonTrainer(String trainerName, List<Pokemon> pokemons) {
        this.name = trainerName;
        PokemonTrainer.pokemons = pokemons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Pokemon> getPokemons() {
        return pokemons;
    }

    public static void setPokemons(List<Pokemon> pokemons) {
        PokemonTrainer.pokemons = pokemons;
    }


}
