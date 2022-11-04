package templatemethod;

public class Bard extends CharacterTemplate {
    @Override
    void castSpell1() {
        System.out.println("Casting Empowering Riff");
    }

    @Override
    void castSpell2() {
        System.out.println("Casting Captivating Chords");
    }
}
