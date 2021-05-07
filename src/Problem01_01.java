import java.util.HashMap;

public class Problem01_01 {
    public static boolean isUnique(String s) {
        HashMap<Character, Boolean> characters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characters.containsKey(c)) {
                return false;
            } else {
                characters.put(c, true);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("abcdef: " + isUnique("abcdef"));
        System.out.println("aabcdef: " + isUnique("aabcdef"));
    }
}
