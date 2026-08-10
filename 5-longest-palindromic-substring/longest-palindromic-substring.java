class Solution {
    public String longestPalindrome(String s) {
        if ( s== null || s.length() < 1) return "";

        int start = 0 ; 
        int maxLength = 0;

        for(int i =0 ; i < s.length(); i++){

            int left = i; 
            int right = i;
            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int currentLen = right - left + 1;
                if (currentLen > maxLength){
                    start = left;
                    maxLength = currentLen;
                }
                left--;
                right++;
            }
        
            left = i; 
            right = i+1;
            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                int currentLen = right - left + 1;
                if (currentLen > maxLength){
                    start = left;
                    maxLength = currentLen;
                }
                left--;
                right++;
            }
        }
        
        return s.substring(start, start + maxLength);
    } 
} 