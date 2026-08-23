class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        int[] lastIndex = new int[128];

        for(int right= 0,left = 0; right<s.length(); right++){
            char currentChar = s.charAt(right);

            left=Math.max(left, lastIndex[currentChar]);

            maxLength = Math.max(maxLength, right - left+1);

            lastIndex[currentChar]= right +1;
        }
        return maxLength;
    }
}