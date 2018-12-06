package main.Character.Armor;

public class Plate implements ArmorBehavior {
    @Override
    public void defend() {
        System.out.println("Defend with plate armor.");
    }
}
