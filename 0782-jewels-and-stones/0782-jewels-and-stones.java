class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelcount = 0;
        HashSet<Character> map = new HashSet<>();
        for(char ch : jewels.toCharArray())
        {
            map.add(ch);
        }

        for(char chs : stones.toCharArray())
        {
            if(map.contains(chs))
            {
                jewelcount++;
            }
        }
        return jewelcount;
    }
}