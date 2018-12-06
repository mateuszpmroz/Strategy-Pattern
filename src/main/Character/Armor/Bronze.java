package main.Character.Armor;

public class Bronze implements ArmorBehavior {
    @Override
    public void defend() {
        System.out.println("Defend with bronze armor.");
    }
}
