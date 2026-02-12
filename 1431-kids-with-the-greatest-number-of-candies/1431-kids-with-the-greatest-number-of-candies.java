class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> lst = new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            max = Math.max(candies[i],max);
        }

        for(int i=0;i<n;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                lst.add(true);
            }
            else
            {
                lst.add(false);
            }
        }
        return lst;
    }
}