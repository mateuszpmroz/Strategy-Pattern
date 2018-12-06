package main.Character;

import main.Character.Armor.Plate;
import main.Character.Weapon.Sword;

public class Warrior extends Character {
    public Warrior() {
        Plate plate = new Plate();
        Sword sword = new Sword();
        this.setWeaponBehavior(sword);
        this.setArmorBehavior(plate);
    }
}
