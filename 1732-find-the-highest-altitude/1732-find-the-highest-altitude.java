class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int m=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            m=m+gain[i];
            if(m>max)
            {
                max=m;
            }
        }
        return max;
    }
}