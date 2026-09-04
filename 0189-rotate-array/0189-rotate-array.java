class Solution {
    public void reverse(int[] nums , int n,int m){
        while(n<m){
            int temp = nums[n];
            nums[n]=nums[m];
            nums[m]=temp;
            n++;
            m--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
       
    }
}