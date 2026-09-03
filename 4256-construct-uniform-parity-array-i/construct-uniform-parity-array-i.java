class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;

        for (int targetParity = 0; targetParity <= 1; targetParity++) {
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                boolean canForm = false;

                if (Math.abs(nums1[i]) % 2 == targetParity) {
                    canForm = true;
                } else {
                    for (int j = 0; j < n; j++) {
                        if (i != j) {
                            int diff = nums1[i] - nums1[j];
                            if (Math.abs(diff) % 2 == targetParity) {
                                canForm = true;
                                break;
                            }
                        }
                    }
                }

                if (!canForm) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                return true;
            }
        }

        return false;
    }
}