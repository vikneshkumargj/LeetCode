class Solution {
    public int search(int[] nums, int target) {
        int peak = findpivot(nums,target);
        if(peak==-1)
        {
            return binarysearch(nums,target,0,nums.length-1);
        }
        else if(peak!=-1)
        {
            if(nums[peak]==target)
            {
                return peak;
            }
            else if(nums[0]>target)
            {
                return binarysearch(nums,target,peak+1,nums.length-1);
            }
            else {
                return binarysearch(nums,target,0,peak-1);
            }
        }
        return -1;
    }
    static int findpivot(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            else if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr , int target , int start , int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
