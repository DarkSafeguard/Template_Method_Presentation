package SadnessMethod;

public abstract class Character {
    private String name;

    public final void castSpells(){
        teleportToFight();
        castSpell1();
        castSpell2();

    }

    abstract void teleportToFight();
    abstract void castSpell1();
    abstract void castSpell2();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
