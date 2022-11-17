package sadnessmethod;

public abstract class Character {
    private String name;

    //Method that all subclasses follow that uses abstract classes
    //Each abstract class will need to be overridden in each subclass

    //Are there any methods EVERYONE should have?
    public final void castSpells(){
        teleportToFight();
        castSpell1();
        castSpell2();

    }

    //Abstract methods that all subclasses will have
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
