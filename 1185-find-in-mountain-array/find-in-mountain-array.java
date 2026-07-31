/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
int length = mountainArr.length();
        
        // 1. Peak index dhundo
        int peak = findPeak(mountainArr, length);

        // 2. Ascending part me search karo (0 se peak tak)
        int index = binarySearchAscending(mountainArr, target, 0, peak);
        if (index != -1) {
            return index; 
        }

        // 3. Descending part me search karo (peak + 1 se length - 1 tak)
        return binarySearchDescending(mountainArr, target, peak + 1, length - 1);
    }

    private int findPeak(MountainArray mountainArr, int length) {
        int start = 0;
        int end = length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid; 
            } else {
                start = mid + 1; 
            }
        }
        return start;
    }

    private int binarySearchAscending(MountainArray mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchDescending(MountainArray mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            } else if (midVal > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}