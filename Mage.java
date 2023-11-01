public class Mage extends Character {

  public Mage(String name) {
    super(name, "Mage");
    life = 70;
    strength = 3;
    agility = 10;
    wit = 10;

    System.out.println(name + ": May the gods be with me.");
  }

  public Mage(String name, int capacity) {
    super(name, "Mage", capacity);
    life = 70;
    strength = 3;
    agility = 10;
    wit = 10;

    System.out.println(name + ": May the gods be with me.");
  }

  @Override
  public void attack(String weapon) {
    if (weapon.equalsIgnoreCase("magic") || weapon.equalsIgnoreCase("wand")) {
      super.attack(weapon);
      System.out.println(getName() + ": Feel the power of my " + weapon + "!");
    }
  }

  @Override
  public void moveRight() {
    System.out.println(getName() + ": moves right furtively.");
  }

  @Override
  public void moveLeft() {
    System.out.println(getName() + ": moves left furtively.");
  }

  @Override
  public void moveForward() {
    System.out.println(getName() + ": moves forward furtively.");
  }

  @Override
  public void moveBack() {
    System.out.println(getName() + ": moves back furtively.");
  }

}

