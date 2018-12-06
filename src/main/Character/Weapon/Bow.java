package main.Character.Weapon;

public class Bow implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Attack with bow!");
    }
}
