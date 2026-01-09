class Solution {
    public int missingNumber(int[] nums) {
        int s1=0;
        int s2=0;
        int n = nums.length;
        s1= n*(n+1)/2;
        for(int i =0;i<n;i++)
        {
            s2=s2+nums[i];
        }
        System.out.println(s1);
        return s1-s2;
    }
}