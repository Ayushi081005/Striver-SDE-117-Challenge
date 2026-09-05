class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int[] targetMap = new int[128];
        for (char c : t.toCharArray()) {
            targetMap[c]++;
        }

        int required = 0;
        for (int count : targetMap) {
            if (count > 0) required++;
        }

        int[] windowMap = new int[128];
        int formed = 0;

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap[c]++;

            if (targetMap[c] > 0 && windowMap[c] == targetMap[c]) {
                formed++;
            }

            // Contract window from the left once all required characters are present
            while (left <= right && formed == required) {
                c = s.charAt(left);

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                windowMap[c]--;
                if (targetMap[c] > 0 && windowMap[c] < targetMap[c]) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}