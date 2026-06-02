class Solution {
    public int maxArea(int[] heights) {
        int maximum = Integer.MIN_VALUE;
        int length = heights.length;
        int left = 0;
        int right = length-1;
        while (left < right ){
            int height = Math.min(heights[left],heights[right]);
            int width = right - left;
            int area = height * width;
            maximum = Math.max(area,maximum);
            if (heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maximum;
    }
}
