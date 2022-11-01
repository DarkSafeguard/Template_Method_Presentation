package TemplateMethod;

public class Mage extends CharacterTemplate {
    @Override
    void castSpell1() {
        System.out.println("Casting Fireball");
    }

    @Override
    void castSpell2() {
        System.out.println("Casting Chain Lightning");
    }

    @Override
    public void teleportToFight() {
        System.out.println(super.getName() + " Teleported to the back line");
    }
}
