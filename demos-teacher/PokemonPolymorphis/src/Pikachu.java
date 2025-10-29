import com.Pokemon.Pokemon;

public class Pikachu extends Pokemon {
    public Pikachu(String name) {
        super(name);
    }

    @Override
    public String attack() {
        System.out.println("Super WHOOP!");
        return "";
    }
}
