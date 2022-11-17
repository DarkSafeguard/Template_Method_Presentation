package templatemethod;

public abstract class CharacterTemplate {

    private String name;

    public final void castSpells(){
        teleportToFight();
        castSpell1();
        castSpell2();

    }

    public void teleportToFight(){
        System.out.println(getName() + " Teleported into the fight!");
    }
    abstract void castSpell1();
    abstract void castSpell2();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
