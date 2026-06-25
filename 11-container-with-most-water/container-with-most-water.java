class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0 ;
        int end =n-1;
        int area =0 ;
        int max_area =0 ;
        while (end>start)
        {
            area = (end - start) * Math.min(height[start], height[end]);
            max_area = Math.max(area,max_area);
            if (height[start] < height[end])
            start++;
            else 
            end--;

        }
        return max_area;
    }
}