int majorityElement(int* nums, int numsSize) {
    int temp;
    int count=0;
    for(int i =0;i<numsSize;i++)
    {
        if(count==0)
        {
            count=1;
            temp=nums[i];
        }
        else if(nums[i]==temp)
        {
            count++;
        }
        else count--;
    }
    return temp;
}