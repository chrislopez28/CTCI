import java.util.HashMap;

public class Problem01_02 {

    public static HashMap<Character, Integer> stringHashMap(String s) {
        HashMap<Character, Integer> strDict = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (strDict.containsKey(c)) {
                strDict.put(c, strDict.get(c) + 1);
            } else {
                strDict.put(c, 1);
            }
        }
        return strDict;
    }

    public static Boolean areHashMapsEqual(HashMap<Character, Integer> h1, HashMap<Character, Integer> h2) {
        if (!h1.keySet().equals(h2.keySet())) {
            return false;
        }
        for (char k : h1.keySet()) {
            if (!h1.get(k).equals(h2.get(k))) {
                return false;
            }
        }
        return true;
    }

    public static Boolean isPermutation(String s1, String s2) {
        HashMap<Character, Integer> dict1 = stringHashMap(s1);
        HashMap<Character, Integer> dict2 = stringHashMap(s2);

        return areHashMapsEqual(dict1, dict2);
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1: " + isPermutation("Hello", "elloH"));
        System.out.println("Test Case 2: " + isPermutation("Hello", "elloHD"));
        System.out.println("Test Case 3: " + isPermutation("Hello", "hello"));
    }
}
