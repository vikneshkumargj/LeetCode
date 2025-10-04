class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r = height.length-1;
        int ans=-1;
        while(l<r)
        {
            int w = r-l;
            if(ans<w*Math.min(height[l],height[r]))
            {
                ans=w* Math.min(height[l],height[r]);
            }
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return ans;
    }
}