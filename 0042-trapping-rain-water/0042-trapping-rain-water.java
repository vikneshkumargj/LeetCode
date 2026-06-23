class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] maxr = new int[n];
        int[] maxl = new int[n];
        int total =0;
        maxl[0] = h[0]; 
        for(int i=1;i<n;i++)
        {
            maxl[i] = Math.max(maxl[i-1],h[i]);
        }
        maxr[n-1] = h[n-1];
        for(int i=n-2;i>=0;i--)
        {
            maxr[i]=Math.max(maxr[i+1],h[i]);
        }
        for(int i=0;i<n;i++)
        {
            total += (Math.min(maxl[i],maxr[i]))-h[i];
        }
        return total;
    }
}