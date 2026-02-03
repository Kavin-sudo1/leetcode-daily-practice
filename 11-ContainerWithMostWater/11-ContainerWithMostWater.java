// Last updated: 2/3/2026, 8:12:01 PM
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxarea = 0;

        while (i < j) {
            int width = j - i;
            int h = Math.min(height[i], height[j]);
            int area = width * h;
            maxarea = Math.max(maxarea, area);

            // move the pointer at smaller height
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxarea;
    }
}
