class Solution {
    public int maxProduct(int[] nums) {
       int MaxValue = 0;
       int n = nums.length;

       for(int i = 0 ; i < n ; i++ ){
        for(int j = i+1 ; j < n ; j++){
            int currentProduct = (nums[i]-1)*(nums[j]-1);
            MaxValue = Math.max(MaxValue, currentProduct);
        }
       } 
       return MaxValue;
    }
}