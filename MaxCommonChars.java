    public static void main(String[] args) {
        System.out.println("abcdedeara" + " " + maxLCS("abcdedeara"));
        System.out.println("abcdecdefg" + " " + maxLCS("abcdecdefg"));
        System.out.println("zzzxxxzzz" + " " + maxLCS("zzzxxxzzz"));
    }

    public static int maxLCS(String s) {
        int maxCount = Integer.MIN_VALUE;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int currCommonChars = findCommonCharCount(s.substring(0, i), s.substring(i));
            if (currCommonChars > maxCount) {
                maxCount = currCommonChars;
            }
        }
        return maxCount;
    }
    static final int MAX_CHAR_COUNT = 26;
    private static int findCommonCharCount(String str1, String str2) {
        int[] arr1 = new int[MAX_CHAR_COUNT];
        int[] arr2 = new int[MAX_CHAR_COUNT];
        int l1 = str1.length();
        int l2 = str2.length();
        int counter = 0;
        for (int i = 0; i < l1; i++)
            arr1[str1.charAt(i)-'a'] += 1;
        for (int i = 0; i < l2; i++)
            arr2[str2.charAt(i)-'a'] += 1;
        for (int i = 0; i < MAX_CHAR_COUNT; i++) {
            if (arr1[i] != 0 && arr2[i] != 0) {
                for (int j = 0; j < Math.min(arr1[i], arr2[i]); j++) {
                    counter++;
                }
            }
        }
        return counter;
    }
