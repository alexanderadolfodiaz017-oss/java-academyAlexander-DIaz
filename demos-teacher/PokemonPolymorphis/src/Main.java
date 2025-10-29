import com.Pokemon.Pokemon;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Pikachu("Pika"));
        pokemons.add(new Charzard("Charzard"));

        for (int i = 0; i < pokemons.size(); i++) {
            pokemons.get(i).attack();
        }
    }
}
