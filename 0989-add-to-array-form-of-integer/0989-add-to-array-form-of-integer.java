class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = num.length;
        int carry = 0;
        for(int i=n-1;i>=0;i--)
        {
            num[i] = num[i] + k % 10 + carry;
            carry = num[i]/10;
            ans.add(num[i]%10);
            k/=10;
        }
        k = k+carry;
        while(k>0)
        {
            ans.add(k%10);
            k=k/10;
        }
        Collections.reverse(ans);
        return ans;
    }
}