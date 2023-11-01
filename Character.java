import java.util.Objects;


public abstract class Character implements Movable, Comparable<Character> {

    protected final String RPGClass;

    protected String name;

    protected int life = 50;

    protected int agility = 2;

    protected int strength = 2;

    protected int wit = 2;

    protected int capacity = 0;

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

    protected Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public int getCapacity() {
        return capacity;
    }

    public void attack(String weapon) {
        System.out.println(getName() + ": Rrrrrrrrr....");
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(getName() + ": unsheathes his weapon.");
    }

    @Override
    public int compareTo(Character character) {
        if (Objects.equals(this.getRPGClass(), character.getRPGClass())) {
            if (this.getCapacity() == character.getCapacity()) {
                return 0;
            }
            return this.getCapacity() > character.getCapacity() ? 1 : -1;
        } else {
            if (Objects.equals(this.getRPGClass(), "Warrior")) {
                return this.getCapacity() % character.getCapacity() == 0 ? 1 : -1;
            } else if (Objects.equals(this.getRPGClass(), "Mage")) {
                return character.getCapacity() % this.getCapacity() == 0 ? -1 : 1;
            }
        }
        return 0;
    }
}