package GB;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    protected static HashMap<String, HashSet<String>> hmBook = new HashMap<>();

    public static void set(String family, String number){
        if (!hmBook.containsKey(family)) {
            hmBook.put(family, new HashSet<>());
        }
        hmBook.get(family).add(number);
    }

    public static HashSet<String> get(String family){
        return hmBook.get(family);
    }
}
