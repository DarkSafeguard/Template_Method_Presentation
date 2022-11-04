package sadnessmethod;

public class Priest extends Character{

    @Override
    void castSpell1() {
        System.out.println("Casting Cleansing Aura");
    }

    @Override
    void castSpell2() {
        System.out.println("Casting Redemption");
    }

    @Override
    public void teleportToFight() {
        System.out.println(super.getName() + " Teleported to the back line");
    }
}
