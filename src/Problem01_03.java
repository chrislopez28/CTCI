public class Problem01_03 {
    public static String urlify(String s, Integer length) {
        char[] charArr = s.toCharArray(); // Character Array so operation can be performed in-place
        int count = 0;
        StringBuilder url = new StringBuilder(); // StringBuilder b/c String concatenation takes quadratic time O(n^2)
        for (char c : charArr) {
            count++;
            if (Character.isWhitespace(c)) {
                url.append("%20");
            } else {
                url.append(c);
            }
            if (count == length) break;
        }
        return url.toString();
    }

    public static void main(String[] args) {
        String[][] testCases = {{"Mr John Smith    ", "13"}, {"Boots and Cats", "14"}, {"Arrays and Strings", "18"}, {"nospace", "7"}};
        for (String[] s : testCases) {
            System.out.println("Test Case '" + s[0] + "': " + urlify(s[0], Integer.parseInt(s[1])));
        }
    }
}
