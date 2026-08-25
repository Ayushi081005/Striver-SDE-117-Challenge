class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        
        int multiple = k;
        for (int num : nums) {
            if (num == multiple) {
                multiple += k;
            }
        }
        
        return multiple;
    }
}