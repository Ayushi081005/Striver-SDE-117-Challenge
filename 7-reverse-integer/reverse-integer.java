class Solution {
    public int reverse(int x) {
        
        boolean isNegative = x < 0;
        String str = String.valueOf(Math.abs((long)x));

        String reversedStr = new StringBuilder(str).reverse().toString();

        try{
            long result = Long.parseLong(reversedStr);
            if(isNegative){
                result = -result;
            }
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                return 0;
            }
            
            return (int) result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}