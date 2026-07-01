class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));
        for(Map.Entry<Integer,Integer> num : freq.entrySet())
        {
            heap.offer(num);
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = heap.poll().getKey();
        }
        return ans;


    }
}