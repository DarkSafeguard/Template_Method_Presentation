package nomethod;

public class Knight {
    private String name;

    public void castSpells(){
        teleportToFight();
        castSpell1();
        castSpell2();
    }

    public void castSpell1() {
        System.out.println("Sword Slash");
    }

    public void castSpell2() {
        System.out.println("Shield Bash");
    }

    public void teleportToFight() {
        System.out.println(getName() + " Teleported to the back line");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
