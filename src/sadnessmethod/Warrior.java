package sadnessmethod;

public class Warrior extends Character{
    @Override
    void castSpell1() {
        System.out.println("Casting Castle Of Stone");
    }

    @Override
    void castSpell2() {
        System.out.println("Casting Anchor Howl!");
    }

    @Override
    public void teleportToFight() {
        System.out.println(super.getName() + " Teleported to the front line");
    }
}
