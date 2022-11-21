package nomethod;

public class Mage {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void castSpell1() {
        System.out.println("Sword Slash");
    }

    public void castSpell2() {
        System.out.println("Shield Bash");
    }

    public void teleportToFight() {
        System.out.println(getName() + " Teleported to the fight!");
    }

    public void castSpells(){
        teleportToFight();
        castSpell1();
        castSpell2();
    }
}
