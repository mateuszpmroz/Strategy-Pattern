package main.Character;

import main.Character.Armor.ArmorBehavior;
import main.Character.Weapon.WeaponBehavior;

public class Character {
    private WeaponBehavior weaponBehavior;
    private ArmorBehavior armorBehavior;

    public void setArmorBehavior(ArmorBehavior armorBehavior) {
        this.armorBehavior = armorBehavior;
    }

    public void performArmor() {
        this.armorBehavior.defend();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon() {
        this.weaponBehavior.attack();
    }
}
