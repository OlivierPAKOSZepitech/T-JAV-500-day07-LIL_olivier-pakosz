public abstract class Character implements Movable, Comparable<Character>{
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;
    protected int capacity;

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.capacity = 0;
    }

    protected Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Character other) {
        if (this.getClass().equals(other.getClass())) {
            return Integer.compare(this.capacity, other.capacity);
        }
        if ((this instanceof Warrior && other instanceof Mage) || (this instanceof Mage && other instanceof Warrior)) {

            if (this instanceof Warrior && this.capacity % other.capacity == 0) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }
    
    public int getCapacity() {
        return capacity;
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

    public String getRPGClass() {
        return RPGClass;
    }
    public void attack(String weapon) {
        System.out.println(name + ": Rrrrrrrrr....");
    }
    public void moveRight(){
        System.out.println(name + ": moves right");
    }

    public void moveLeft(){
        System.out.println(name + ": moves left");
    }

    public void moveForward(){
        System.out.println(name + ": moves forward");
    }

    public void moveBack(){
        System.out.println(name + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(name + ": unsheathes his weapon");
    }

}
