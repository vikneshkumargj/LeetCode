class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int no : nums)
        {
            if(count(no)%2==0)count++;
        }
        return count;
    }

    static int count(int num)
    {
        int count=(int)Math.log10(num)+1;
        return count;
    }
}