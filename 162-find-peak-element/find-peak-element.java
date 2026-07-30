class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Peak lies to the right
                start = mid + 1;
            } else {
                // Peak lies at mid or to the left
                end = mid;
            }
        }

        // 'start' and 'end' will converge at the peak index
        return start;
  
    }
}