class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(char i='a';i<='z';i++)
        {
            if(sentence.indexOf(i)==-1)
            {
                return false;
            }

        }
        return true;
        
    }
}