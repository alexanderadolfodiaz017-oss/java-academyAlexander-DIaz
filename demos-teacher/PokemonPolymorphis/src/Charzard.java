import com.Pokemon.Pokemon;

public class Charzard extends Pokemon {
    public Charzard(String name) {
        super(name);
    }

    @Override
    public String attack() {
        System.out.println("Psychic Blast!");
        return "";
    }
}
