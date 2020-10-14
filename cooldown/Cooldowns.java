package cooldown;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * The class represents a simple implementation of a Cooldown.
 * The timestamp from the system is used as a cool down.
 * This is used for most of the entries to see if an entry still has a cooldown
 */
public class Cooldowns {

    private final Map<String, Long> cooldowns;

    public Cooldowns() {
        this.cooldowns = new HashMap<>();
    }

    /**
     * Add a cooldown to a specific name
     * @param name The name to add
     * @param duration The duration for the cooldown
     */

    public void add(String name, long duration) {
        this.cooldowns.putIfAbsent(name, System.currentTimeMillis() + duration);
    }

    /**
     * Remove a cooldown from a entry
     * @param name The name of the entry to remove
     */

    public void remove(String name) {
        this.cooldowns.remove(name);
    }

    /**
     * Check if a entry has currently a cooldown.
     * @param name The entry to check
     * @return True when the entry has a cooldown otherwise false
     */

    public boolean has(String name) {
        return cooldowns.getOrDefault(name, 0L) > 0;
    }


    /**
     * Returns the current timestamp as long from a entry
     * @param name The entry to check
     * @return The timestamp as long in a optional.
     */

    public Optional<Long> getTimeStamp(String name) {
        return Optional.ofNullable(cooldowns.get(name));
    }
}