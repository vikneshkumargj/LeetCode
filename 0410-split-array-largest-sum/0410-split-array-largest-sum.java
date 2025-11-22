class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++)
        {
            start = Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            int count = countstu(nums,mid);
            if(count>k)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
        }
        return start;
    }

    public int countstu(int[] nums,int mid)
    {
        int student=1;
        long currentpages=0L;
        for(int i =0;i<nums.length;i++)
        {
            if(currentpages+nums[i]<=mid)
            {
                currentpages+=nums[i];
            }
            else
            {
                student++;
                currentpages=nums[i];
            }
        }
        return student;
    }
}