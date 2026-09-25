class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            lst.add(rows(i));
        }
        return lst;
    }

    public List<Integer> rows(int n){
        List<Integer> temp = new ArrayList<>();
        int ans=1;
        temp.add(ans);
        for(int i=1;i<n;i++){
            ans = ans * (n-i);
            ans = ans / i;
            temp.add(ans);
        }
        return temp;
    }
}