package templatemethod;

public class Druid extends CharacterTemplate {
    @Override
    void castSpell1() {
        System.out.println("Casting Hardened Hide");
    }

    @Override
    void castSpell2() {
        System.out.println("Casting Bull Rush");
    }
}
