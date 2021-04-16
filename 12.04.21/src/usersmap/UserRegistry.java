package usersmap;

import java.util.Map;
import java.util.TreeMap;

public class UserRegistry {

    private static Map<String, Integer> registry = new TreeMap<>();

    public static void putUserInRegistry(String data, int year) {
        registry.put(data, year);
    }

    public static Map<String, Integer> getRegistry() {
        return registry;
    }
}