class Solution {
    public List<String> removeAnagrams(String[] words) {
        int[] nos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        int prod =1;
        int prev=-1;
        List<String> ans = new ArrayList<>();        
        for(String word : words )
        {
            prod=1;
            for(int i=0;i<word.length();i++)
            {
                prod=prod*nos[(word.charAt(i)-'a')];
            }
            if(prev!=prod){
                ans.add(word);
                prev=prod;
            }
            
        }
        return ans;
    }
}