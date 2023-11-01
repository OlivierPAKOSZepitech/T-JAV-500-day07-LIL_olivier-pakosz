public class Warrior extends Character {

  public Warrior(String name) {
    super(name, "Warrior");
    life = 100;
    strength = 10;
    agility = 8;
    wit = 3;

    System.out.println(name + ": My name will go down in history!");
  }

  public Warrior(String name, int capacity) {
    super(name, "Warrior", capacity);
    life = 100;
    strength = 10;
    agility = 8;
    wit = 3;

    System.out.println(name + ": My name will go down in history!");
  }

  @Override
  public void attack(String weapon) {
    if (weapon.equalsIgnoreCase("hammer") || weapon.equalsIgnoreCase("sword")) {
      super.attack(weapon);
      System.out.println(getName() + ": I'll crush you with my " + weapon + "!");
    }
  }

  @Override
  public void moveRight() {
    System.out.println(getName() + ": moves right like a bad boy.");
  }

  @Override
  public void moveLeft() {
    System.out.println(getName() + ": moves left like a bad boy.");
  }

  @Override
  public void moveForward() {
    System.out.println(getName() + ": moves forward like a bad boy.");
  }

  @Override
  public void moveBack() {
    System.out.println(getName() + ": moves back like a bad boy.");
  }

}
