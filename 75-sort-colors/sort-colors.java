class Solution {
    public void sortColors(int[] nums) {
        final int RED = 0;
        final int WHITE = 1;
        final int BLUE = 2;

        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while (white <= blue) {
            if (nums[white] == RED) {
                swap(nums, red , white);
                red++;
                white++;
            } else if (nums[white] == WHITE) {
                white++;
            } else if (nums[white] == BLUE) {
                swap(nums, white, blue);
                blue--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}