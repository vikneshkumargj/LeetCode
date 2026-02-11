class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        int count=0;
        int i=0;
        while(count!=n*2)
        {
            if(count==n-1)
            {
                ans[count]=nums[i];
                i=0;
                count++;
            }
            else
            {
                ans[count]=nums[i];
                i++;
                count++;
            }
        }
        return ans;
    }
}