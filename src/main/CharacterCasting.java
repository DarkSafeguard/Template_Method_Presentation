package main;

import sadnessmethod.Priest;
import sadnessmethod.Warrior;
import templatemethod.CharacterTemplate;
import sadnessmethod.Character;

import sadnessmethod.Monk;
import templatemethod.Bard;
import templatemethod.Druid;
import templatemethod.Mage;

public class CharacterCasting {
    public static void main(String[] args) {
        CharacterTemplate bardMain = new Bard();
        bardMain.setName("Bard");
        bardMain.castSpells();

        System.out.println();

        CharacterTemplate druidMain = new Druid();
        druidMain.setName("Druid");
        druidMain.castSpells();

        System.out.println();

        CharacterTemplate mageMain = new Mage();
        mageMain.setName("Mage");
        mageMain.castSpells();

        System.out.println();

        Character monkMain = new Monk();
        monkMain.setName("Monk");
        monkMain.castSpells();

        System.out.println();

        Character priestMain = new Priest();
        priestMain.setName("Priest");
        priestMain.castSpells();

        System.out.println();

        Character warriorMain = new Warrior();
        warriorMain.setName("Warrior");
        warriorMain.castSpells();
    }
}
