class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int l=0;
        int r = h.length-1;
        while(l<=r)
        {
            int len = Math.min(h[l],h[r]);
            int b = r-l;
            max = Math.max(max,(len*b));
            if(h[l]<=h[r])
            {
                l++;
            }
            else{
            r--;}
        }
        return max;
    }
}