package cooldown;

/**
 * The class has some simple test to check if the {@link Cooldowns} works!
 */

public class CooldownTest {

    /**
     * Runs some tests with the cooldown.
     * @param args Not in use
     */

    public static void main(String[] args) {
        Cooldowns cooldowns = new Cooldowns();

        //Adds a cooldown to a entry

        cooldowns.add("Car", 3000L);

        //Checks if a entry has a cooldown

        System.out.println(cooldowns.has("Car")); //True
        System.out.println(cooldowns.has("Dog")); //False
    }
}
