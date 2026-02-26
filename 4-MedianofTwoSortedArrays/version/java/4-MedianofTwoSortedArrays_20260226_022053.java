// Last updated: 2/26/2026, 2:20:53 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int i = 0, j = height.length - 1;
4        int maxarea = 0;
5
6        while (i < j) {
7            int width = j - i;
8            int h = Math.min(height[i], height[j]);
9            int area = width * h;
10            maxarea = Math.max(maxarea, area);
11
12            // move the pointer at smaller height
13            if (height[i] < height[j]) {
14                i++;
15            } else {
16                j--;
17            }
18        }
19        return maxarea;
20    }
21}