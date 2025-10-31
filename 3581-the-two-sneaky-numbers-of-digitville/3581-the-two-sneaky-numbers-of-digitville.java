class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int[] ans = new int[2];
        int index=0;
        for(int num : nums)
        {
            if(map.contains(num))
            {
                ans[index++]=num;
            }
            else map.add(num);
        }
        return ans;
    }
}