package GB;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    //постарался сделать кратко, как и просили
    public static void main(String[] args) {
        //1.
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "pepper",
                "apple", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "banana",
                "broccoli", "apple", "pumpkin", "peanut", "pear", "garlic", "pineapple", "banana", "apple"};
        HashSet<String> hsWords = new HashSet<>(Arrays.asList(words));
        System.out.println(hsWords);
        HashMap<String, Integer> hmWords = new HashMap<>();
        for (String word : words) {
            hmWords.put(word, (hmWords.get(word) == null) ? 1 : hmWords.get(word) + 1);
        }
        System.out.println(hmWords);
        //2.
        PhoneBook.set("qwerty", "8800200700");
        PhoneBook.set("qwerty", "+79500202020");
        PhoneBook.set("qwerty", "8 3466 67 42 42");
        PhoneBook.set("asd", "89999999999");
        PhoneBook.set("asd", "+89997777777");
        System.out.println(PhoneBook.get("asd"));
        System.out.println(PhoneBook.get("qwerty"));


    }
}
