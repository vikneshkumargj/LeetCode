class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->{
            int distA = Math.abs(a-x);
            int distB = Math.abs(b-x);

            if(distA == distB)
            {
                return Integer.compare(a,b);
            }
            return Integer.compare(distA,distB);
        });

        for(int num : arr)
        {
            heap.add(num);
        }

        List<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            res.add(heap.poll());
        }
        Collections.sort(res);
        return res;
    }
}