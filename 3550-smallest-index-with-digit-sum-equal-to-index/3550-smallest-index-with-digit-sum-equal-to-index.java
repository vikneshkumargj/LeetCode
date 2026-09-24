class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=9 && nums[i]==i){
                return i;
            }
            
            if(nums[i]>9){
                int temp = nums[i];
                int sum=0;
                while(temp!=0){
                    sum = sum+ temp %10;
                    temp= temp/10;
                }
                if(sum==i){
                    return i;
                }
            }
        }
        return -1;
    }
}