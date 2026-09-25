class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> lst = new ArrayList<>();
        long ans =1;
        lst.add((int)ans);
        for(int i=1;i<=n;i++){
            ans = ans * (n-i+1);
            ans = ans / i;
            lst.add((int)ans);
        }
        return lst;
    }
}