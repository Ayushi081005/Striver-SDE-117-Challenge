class Solution {
    public boolean checkStrings(String s1, String s2) {
      int[] evenCounts = new int[26];
        int[] oddCounts = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                evenCounts[s1.charAt(i) - 'a']++;
                evenCounts[s2.charAt(i) - 'a']--;
            } else {
                oddCounts[s1.charAt(i) - 'a']++;
                oddCounts[s2.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (evenCounts[i] != 0 || oddCounts[i] != 0) {
                return false;
            }
        }

        return true;  
    }
}