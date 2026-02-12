class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> lst = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            lst.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=lst.get(i);
        }
        return ans;
    }
}