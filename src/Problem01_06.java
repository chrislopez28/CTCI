public class Problem01_06 {
    public static String stringCompress(String s) {
        StringBuilder compressed = new StringBuilder();
        char[] charArr = s.toCharArray();
        int count = 1;
        char prev = charArr[0];

        for (int i = 1; i < charArr.length; i++) {
            if (charArr[i] == prev) {
                count++;
            } else {
                compressed.append(prev);
                compressed.append(count);
                prev = charArr[i];
                count = 1;
            }
        }
        compressed.append(prev);
        compressed.append(count);

        if (s.length() > compressed.length()) return compressed.toString();
        return s;
    }

    public static void main(String[] args) {
        String[] testCases = {"aabcccccaaa", "abcdefg", "aabbccd", "aaabbbd"};
        for (String testCase : testCases) {
            System.out.println("Test '" + testCase + "': " + stringCompress(testCase));
        }
    }
}
