class Solution {
    public int maxArea(int[] height) {

    int left = 0;
    int right = height.length-1;

    int maxheight = 0;

    while(left < right)
    {
        int area = ( right - left ) * Math.min(height[right],height[left]);
        maxheight = Math.max(maxheight , area);

        if(height[left] < height[right]) left++;
        else right--;
    }
        return maxheight;
    }
}