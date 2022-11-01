package SadnessMethod;

public class Monk extends Character{
    @Override
    void castSpell1() {
        System.out.println("Casting Flurry of Fists");
    }

    @Override
    void castSpell2() {
        System.out.println("Casting Presence of Mind");
    }

    @Override
    public void teleportToFight() {
        System.out.println(super.getName() + " Teleported to the front line");
    }
}
