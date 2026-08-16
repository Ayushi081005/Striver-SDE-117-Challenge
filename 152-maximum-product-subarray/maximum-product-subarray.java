class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];

        for(int i = 0 ; i< nums.length; i++){
            int currentProduct = 1;

            for(int j = i ; j< nums.length; j++){
                currentProduct *= nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }
        return maxProduct;
    }
}