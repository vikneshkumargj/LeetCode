class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int sum=0;
        for(int[] i : accounts)
        {
            sum=0;
            for(int j : i)
            {
                sum=sum+j;
            }
            if(sum>max)max=sum;
        }
        return max;
    }
}