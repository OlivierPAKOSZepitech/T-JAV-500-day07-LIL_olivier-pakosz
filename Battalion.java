import java.util.ArrayList;
import java.util.List;


public class Battalion {

  private List<Character> characters;

  public Battalion() {
    this.characters = new ArrayList<>();
  }

  public <T extends Character> void add(List<T> characters) {
    this.characters.addAll(characters);
  }

  public void display() {
    for (Character character : characters) {
      System.out.println(character.getName());
    }
  }

  public boolean fight() {
    if (characters.size() < 2) {
      return false;
    }
    
    Character first = characters.get(0);
    Character second = characters.get(1);
    int result = first.compareTo(second);

    if (result == 0) {
      this.characters.remove(0);
      this.characters.remove(0);
    } else if (result > 0) {
      this.characters.remove(1);
    } else {
      this.characters.remove(0);
    }

    return true;
  }

}
