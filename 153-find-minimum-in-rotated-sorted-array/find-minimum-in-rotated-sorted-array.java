class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int minElement = nums[0];

        for(int i = 0; i<n ; i++){
            if(nums[i] < minElement){
                minElement = nums[i];
            }
            }
                return minElement;
            }
        }
        
   