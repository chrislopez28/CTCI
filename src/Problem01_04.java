import java.util.HashMap;

public class Problem01_04 {
    public static Boolean isPalindromePermutation(String s) {
        HashMap<Character, Integer> stringDict = new HashMap<>();
        s = s.replaceAll("\\s+", "");
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (stringDict.containsKey(c)) {
                stringDict.put(c, stringDict.get(c) + 1);
            } else {
                stringDict.put(c, 1);
            }
        }
        if (s.length() % 2 == 0) {
            for (char k : stringDict.keySet()) {
                if (stringDict.get(k) % 2 != 0) {
                    return false;
                }
            }
        } else {
            int oddCount = 0;
            for (char k : stringDict.keySet()) {
                if (stringDict.get(k) % 2 != 0) {
                    oddCount++;
                    if (oddCount > 1) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {"Tact Coa", "Coa Tact", "Hello", "Mr Owl ate my metal worm", "My owl ate mr metal worm", "Taco A"};
        for (String testCase : testCases) {
            System.out.println("Test Case '" + testCase + "': " + isPalindromePermutation(testCase));
        }
    }
}
