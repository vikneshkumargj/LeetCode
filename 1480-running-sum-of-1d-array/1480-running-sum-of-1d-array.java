class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int total=0;
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                total+=nums[j];
            }
            ans[i]=total;
            total=0;
        }
        return ans;
    }
}