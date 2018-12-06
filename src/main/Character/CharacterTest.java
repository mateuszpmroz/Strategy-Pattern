package main.Character;

import main.Character.Armor.Plate;
import main.Character.Weapon.Bow;

public class CharacterTest {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.performArmor();
        warrior.performWeapon();
    }
}
