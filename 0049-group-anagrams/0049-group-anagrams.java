class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String curr = strs[i];
            char[] arr = curr.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!mp.containsKey(sorted))
            {
                mp.put(sorted,new ArrayList<>());
            }
            mp.get(sorted).add(curr);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> s :mp.values())
        {
            ans.add(s);
        }
        return ans;
    }
}