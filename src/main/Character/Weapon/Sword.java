package main.Character.Weapon;

public class Sword implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Attack with sword!");
    }
}
