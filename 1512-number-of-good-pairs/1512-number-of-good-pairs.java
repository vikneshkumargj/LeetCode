class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int pairs=0;
        for(int i=0;i<nums.length;i++)
        {
            pairs+=count[nums[i]];
            count[nums[i]]++;
        }
        return pairs;
    }
}