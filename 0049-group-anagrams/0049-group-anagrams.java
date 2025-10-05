import java.math.BigInteger;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] nos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        
        Map<BigInteger,List<String>> map = new HashMap<>();
        for(String word : strs)
        {
            BigInteger prod= BigInteger.ONE;
            for(int i =0;i<word.length();i++)
            {
                
                prod=prod.multiply(BigInteger.valueOf(nos[word.charAt(i)-'a']));
            }
            if(map.containsKey(prod))
            {
                map.get(prod).add(word);
            }
            else
            {
                map.put(prod,new ArrayList<String>());
                map.get(prod).add(word);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> val : map.values())
        {
            ans.add(val);
        }
        return ans;
    }
}