package TemplateMethod;

public abstract class CharacterTemplate {

    private String name;

    //Template Method That All Subclasses Follow.
    //All Character Subclasses Will Have Their Own Spells To Cast And Will Need To Override Those Methods
    //All Character Subclasses Will Use The teleportToFight() Method The Same Way Unless Overridden
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
