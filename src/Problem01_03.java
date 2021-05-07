public class Problem01_03 {
    public static String urlify(String s) {
        char[] charArr = s.toCharArray(); // Character Array so operation can be performed in-place
        StringBuilder url = new StringBuilder(); // StringBuilder b/c String concatenation takes quadratic time O(n^2)
        for (char c : charArr) {
            if (Character.isWhitespace(c)) {
                url.append("%20");
            } else {
                url.append(c);
            }
        }
        return url.toString();
    }

    public static void main(String[] args) {
        String[] testCases = {"Boots and Cats", "Arrays and Strings", "nospace"};
        for (String s : testCases) {
            System.out.println("Test Case '" + s + "': " + urlify(s));
        }
    }
}
