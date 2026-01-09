class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int n : nums)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }
            else
            {
                map.put(n,1);
            }
        }

        for(int m : map.keySet())
        {
            if(map.get(m)==1) return m;
        }

        return -1;
    }
}