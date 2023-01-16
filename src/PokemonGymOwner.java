import java.util.List;

public class PokemonGymOwner extends PokemonTrainer  {

    private String town;


    public PokemonGymOwner(String trainerName, String cityName, List<Pokemon> pokemons) {
        super(trainerName, pokemons);
        this.town = cityName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
