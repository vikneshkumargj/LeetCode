class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 0;row<numRows;row++)
        {
            List<Integer> currRow = new ArrayList<>();
            ans.add(currRow);
            for(int col = 0 ;col<row+1;col++)
            {
                if(col==0||col==row)
                {
                    currRow.add(1);
                }
                else
                {
                    currRow.add(ans.get(row-1).get(col-1));
                    currRow.set(col,currRow.get(col)+ans.get(row-1).get(col));
                }
            }
        }
        return ans;
    }
}