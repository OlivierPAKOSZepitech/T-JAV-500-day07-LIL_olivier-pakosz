import java.util.ArrayList;
import java.util.List;

public class Battalion<T extends Character> {
    private List<T> characters;

    public Battalion() {
        characters = new ArrayList<>();
    }

    public void add(List<? extends T> newCharacters) {
        characters.addAll(newCharacters);
    }

    public void display() {
        for (T character : characters) {
            System.out.println(character.getName());
        }
    }

    public static void main(String[] args) {
        List<Mage> mages = new ArrayList<>();
        mages.add(new Mage("Merlin"));
        mages.add(new Mage("Mandrake"));

        List<Warrior> warriors = new ArrayList<>();
        warriors.add(new Warrior("Spartacus"));
        warriors.add(new Warrior("Clovis"));

        Battalion<Character> battalion = new Battalion<>();
        battalion.add(mages);
        battalion.add(warriors);
        battalion.display();
    }
}