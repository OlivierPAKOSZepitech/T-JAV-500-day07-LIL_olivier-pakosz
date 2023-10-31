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

    public boolean fight() {
        if (characters.size() < 2) {
            return false;
        }
        else {
            T first = characters.get(0);
            T second = characters.get(1);
            int result = first.compareTo(second);
            if (result > 0) {
                characters.remove(1);
            }
            else if (result == 0) {
                characters.remove(0);
                characters.remove(0);
            }
            
            else {
                characters.remove(0);
            }

            return true;
        }
    
    }
}