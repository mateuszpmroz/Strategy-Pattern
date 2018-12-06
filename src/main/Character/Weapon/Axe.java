package main.Character.Weapon;

public class Axe implements WeaponBehavior {
    @Override
    public void attack() {
        System.out.println("Attack with axe!");
    }
}
