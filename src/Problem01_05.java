public class Problem01_05 {
    public static Boolean isOneAway(String s1, String s2) {
        if (s1.equals(s2)) return true;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int editCount = 0;
        int j = 0;
        if (chars1.length == chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
                    editCount++;
                    if (editCount > 1) return false;
                }
            }
        } else if (chars1.length - chars2.length == 1) {
            for (char c : chars1) {
                if (j >= chars2.length) {
                    editCount++;
                    if (editCount > 1) return false;
                    break;
                }

                if (c != chars2[j]) {
                    editCount++;
                    if (editCount > 1) return false;
                    continue;
                }
                j++;
            }
        } else if (chars2.length - chars1.length == 1) {
            for (char c : chars2) {
                if (c != chars1[j]) {
                    editCount++;
                    if (editCount > 1) return false;
                    continue;
                }
                j++;
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] testCases = {{"pale", "ple"}, {"pales", "pale"}, {"pale", "bale"}, {"pale", "bake"}};
        for (String[] testCase : testCases) {
            System.out.println("Test case '" + testCase[0] + "', '" + testCase[1] + "': " + isOneAway(testCase[0], testCase[1]));
        }
    }
}
