class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length; 
       int[] pos = new int[n/2];
       int[] neg = new int[n/2];
       int posindex=0;
       int negindex =0;

       for(int i=0;i<n;i++){
        if(nums[i]>0){
            pos[posindex++]=nums[i];
        }
        else{
            neg[negindex++]=nums[i];
        }
       }
       posindex=0;
       negindex=0;
       for(int i=0;i<n;i++){
        if(i%2==0){
            nums[i]=pos[posindex++];
        }
        else{
            nums[i]=neg[negindex++];
        }
       }
       return nums;
    }
}