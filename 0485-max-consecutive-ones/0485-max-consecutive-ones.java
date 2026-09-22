class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxi=0;
        int count=0;
        for(int num : nums){
            if(num==1){
                count++;
                maxi=Math.max(count,maxi);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }
}